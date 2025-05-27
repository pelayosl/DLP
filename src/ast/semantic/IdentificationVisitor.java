package ast.semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatables.Definition;
import ast.statements.LetStatement;
import ast.types.ErrorType;
import symboltable.SymbolTable;

import java.util.Objects;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{
    private final SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition f, Void param) {
        if(!symbolTable.insert(f)){
            new ErrorType("Function '" + f.getName() + "' already defined", f);
        }
        symbolTable.set();
        super.visit(f, param);
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        super.visit(v, param);
        if(!symbolTable.insert(v)){
            new ErrorType("Variable '" + v.getName() + "' already defined", v);
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Void param){
        super.visit(v, param);
        Definition def = symbolTable.find(v.getName());
        v.setDefinition(Objects.requireNonNullElseGet(def, () -> new VarDefinition(
                v.getLine(),
                v.getColumn(),
                new ErrorType("Definition for name '" + v.getName() + "' not found", v),
                v.getName()
        )));
        return null;
    }

    @Override
    public Void visit(LetStatement ls, Void param) {
        if(!symbolTable.insert(ls)){
            new ErrorType("Variable '" + ls.getName() + "' already defined", ls);
        }
        super.visit(ls, param);
        return null;
    }
}
