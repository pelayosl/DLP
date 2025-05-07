package codegeneration;

import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.RecordField;
import ast.types.RecordType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    public final CodeGenerator codeGenerator;
    public ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }
    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    @Override
    public Void visit(Variable v, Void param){
        if(v.getDefinition().getScope() == 0)
            codeGenerator.pusha(((VarDefinition) v.getDefinition()).getOffset());
        else{
            codeGenerator.pushBP();
            codeGenerator.push(((VarDefinition) v.getDefinition()).getOffset());
            codeGenerator.add(v.getType());
        }
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void param){
        a.getArray().accept(this, param);
        a.getIndex().accept(valueCGVisitor, param);
        codeGenerator.push(a.getType().numberOfBytes());
        codeGenerator.mul(a.getType());
        codeGenerator.add(a.getType());
        return null;
    }

    @Override
    public Void visit(FieldAccess fa, Void param) {
        fa.getExpression().accept(this, param);
        RecordType rt = (RecordType)fa.getExpression().getType();
        RecordField rf = rt.getField(fa.getField());
        codeGenerator.push(rf.getOffset());
        return null;
    }
}
