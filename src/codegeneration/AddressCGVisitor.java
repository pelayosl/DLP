package codegeneration;

import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;
import ast.types.IntType;
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

    /*
     * address[[ Variable: expression -> ID ]]() =
     *   if( expression.definition.scope == 0 )
     *     <pusha> expression.definition.offset
     *   else
     *    <push bp>
     *    <pushi> expression.definition.offset
     *    <addi>
     */
    @Override
    public Void visit(Variable v, Void param){
        if(v.getDefinition().getScope() == 0)
            codeGenerator.pusha(((VarDefinition) v.getDefinition()).getOffset());
        else{
            codeGenerator.pushBP();
            codeGenerator.push(((VarDefinition) v.getDefinition()).getOffset());
            codeGenerator.add(IntType.getInstance());
        }
        return null;
    }

    /*
     * address[[ ArrayAccess: expression1 -> expression2 expression3 ]]() =
     *   address[[ expression2 ]]
     *   value[[ expression3 ]]
     *   <pushi> expression1.type.numberOfBytes()
     *   <muli>
     *   <addi>
     */
    @Override
    public Void visit(ArrayAccess a, Void param){
        a.getArray().accept(this, param);
        a.getIndex().accept(valueCGVisitor, param);
        codeGenerator.push(a.getType().numberOfBytes());
        codeGenerator.mul(IntType.getInstance());
        codeGenerator.add(IntType.getInstance());
        return null;
    }

    /*
     * address[[ FieldAccess: expresssion1 -> expression2 ID ]]() =
     *   address[[ expression2 ]]
     *   <pushi> expression2.type.getField(ID).getOffset()
     *   <addi>
     */
    @Override
    public Void visit(FieldAccess fa, Void param) {
        fa.getExpression().accept(this, param);
        RecordType rt = (RecordType)fa.getExpression().getType();
        RecordField rf = rt.getField(fa.getField());
        codeGenerator.push(rf.getOffset());
        codeGenerator.add(IntType.getInstance());
        return null;
    }
}
