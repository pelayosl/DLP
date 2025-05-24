package codegeneration;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;
import ast.locatables.Statement;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;
import jersey.repackaged.org.objectweb.asm.Type;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, FuncDefinition> {
    public final CodeGenerator codeGenerator;
    public final ValueCGVisitor valueCGVisitor;
    public final AddressCGVisitor addressCGVisitor;

    public ExecuteCGVisitor( CodeGenerator codeGenerator ) {
        this.codeGenerator = codeGenerator;
        this.addressCGVisitor = new AddressCGVisitor(codeGenerator);
        this.valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }
    @Override
    public Void visit(Program p, FuncDefinition param ) {
        for(Definition def : p.getDefinitions()) {
            if(def instanceof VarDefinition){
                def.accept(this, param);
            }
        }
        codeGenerator.callMain();
        codeGenerator.halt();
        for(Definition def : p.getDefinitions()) {
            if(def instanceof FuncDefinition){
                def.accept(this, param);
            }
        }
        return null;
    }

    @Override
    public Void visit(ReadStatement r, FuncDefinition param) {
        codeGenerator.printLine(r.getLine());
        codeGenerator.printComment("Read");
        r.getExpression().accept(addressCGVisitor, null);
        codeGenerator.in(r.getExpression().getType());
        codeGenerator.store(r.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(WriteStatement w, FuncDefinition param) {
        codeGenerator.printLine(w.getLine());
        codeGenerator.printComment("Write");
        w.getExpression().accept(valueCGVisitor, null);
        codeGenerator.out(w.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(FuncDefinition f, FuncDefinition param) {
        System.out.println("New function");
        codeGenerator.printLine(f.getLine());
        codeGenerator.printFunction(f.getName());
        codeGenerator.printComment("Parameters");
        f.getType().accept(this, null); // Parameters
        codeGenerator.printComment("Local variables");
        f.getVariablesList().forEach( v -> { // Local variables
            v.accept(this, null);
        });
        int bytesLocals = f.getVariablesList().isEmpty()? 0 : -((VarDefinition) f.getVariablesList().getLast()).getOffset();
        codeGenerator.enter(bytesLocals);
        f.setLocalBytesSum(bytesLocals);
        FunctionType type = ((FunctionType) f.getType());
        int bytesParams = type.getVarDefinitionList()
                        .stream().mapToInt(p -> p.getType().numberOfBytes()).sum();
        type.setParamBytesSum(bytesParams);
        int bytesReturn = type.getReturnType().numberOfBytes();
        type.setReturnBytesSum(bytesReturn);
        f.getStatementList().forEach( s -> {
            if(!(s instanceof VarDefinition)){
                s.accept(this, f); // cambié esto a ver si funciona, estaba a null entonces nunca le pasaba
                // el function definition al return statement
            }
        });
        // If it's void, returnstatement will never be called
        FunctionType ft = (FunctionType) f.getType();
        if( ft.getReturnType() == VoidType.getInstance() )
            codeGenerator.ret(ft.getReturnBytesSum(), f.getLocalBytesSum(), ft.getParamBytesSum());
        return null;
    }

    @Override
    public Void visit(ReturnStatement r, FuncDefinition param) {
        codeGenerator.printLine(r.getLine());
        codeGenerator.printComment("Return");
        r.getExpression().accept(valueCGVisitor, null);
        codeGenerator.ret(
                ((FunctionType) param.getType())
                        .getReturnBytesSum(),
                param.getLocalBytesSum(),
                ((FunctionType) param.getType())
                        .getParamBytesSum()
        );
        return null;
    }

    @Override
    public Void visit(FunctionType ft, FuncDefinition param) {
        ft.getVarDefinitionList().forEach( v -> v.accept(this, null));
        return null;
    }

    @Override
    public Void visit(VarDefinition v, FuncDefinition param) {
        codeGenerator.printComment(v.getType().toString() + " " + v.getName() + " (offset " + v.getOffset() + ")");
        return null;
    }

    @Override
    public Void visit(Assignment a, FuncDefinition param) {
        codeGenerator.printLine(a.getLine());
        codeGenerator.printComment("Assignment");
        a.getExpression1().accept(addressCGVisitor, null);
        a.getExpression2().accept(valueCGVisitor, null);
        codeGenerator.convertTo(a.getExpression2().getType(), a.getExpression1().getType());
        codeGenerator.store(a.getExpression1().getType());
        return null;
    }

    @Override
    public Void visit(WhileStatement ws, FuncDefinition param) {
        codeGenerator.printLine(ws.getLine());
        codeGenerator.printComment("While");
        int label1 = codeGenerator.getLabels(2);
        codeGenerator.printLine(ws.getLine());
        codeGenerator.label(label1);
        ws.getCondition().accept(valueCGVisitor, null);
        codeGenerator.jz(label1+1);
        codeGenerator.printComment("While body");
        ws.getStatementList().forEach( s -> s.accept(this, null));
        codeGenerator.jmp(label1);
        codeGenerator.label(label1+1);
        return null;
    }

    @Override
    public Void visit(ConditionalStatement cs, FuncDefinition param) {
        codeGenerator.printLine(cs.getLine());
        codeGenerator.printComment("If");
        int label1 = codeGenerator.getLabels(2);
        codeGenerator.printLine(cs.getLine());
        cs.getComparison().accept(valueCGVisitor, null);
        codeGenerator.jz(label1);
        codeGenerator.printComment("if body");
        for(Statement stmt : cs.getIfStatements()){
            stmt.accept(this, null);
        }
        codeGenerator.jmp(label1+1);
        codeGenerator.label(label1);
        codeGenerator.printComment("else body");
        for(Statement stmt : cs.getElseStatements()){
            stmt.accept(this, null);
        }
        codeGenerator.label(label1+1);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, FuncDefinition param){
        codeGenerator.printLine(f.getLine());
        f.accept(valueCGVisitor, null);
        if(((FunctionType)f.getVariable().getType()).getReturnType() != VoidType.getInstance()){
            codeGenerator.pop(((FunctionType) f.getVariable().getType()).getReturnType().suffix());
        }
        return null;
    }
}
