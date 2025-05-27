package codegeneration;

import ast.Type;
import ast.expressions.*;
import ast.statements.FunctionInvocation;
import ast.types.IntType;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    public final CodeGenerator codeGenerator;
    public AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    /*
    * value[[ Variable: variable -> ID ]]() =
    *   address[[Variable]]
    *   <load> variable.type.suffix()
    */
    @Override
    public Void visit(Variable v, Void param) {
        v.accept(addressCGVisitor, param);
        codeGenerator.load(v.getType());
        return null;
    }

    /*
    * value[[ IntLiteral: expression -> INT_LITERAL ]]() =
    *   <pushi> expression.value
    */
    @Override
    public Void visit(IntLiteral i, Void param) {
        codeGenerator.push(i.getValue());
        return null;
    }

    /*
    * value[[ CharLiteral: expression -> CHAR_LITERAL ]]() =
    *   <pushb> expression.value
    */
    @Override
    public Void visit(CharLiteral c, Void param) {
        codeGenerator.push(c.getValue());
        return null;
    }

    /*
    * value[[ NumberLiteral: expression -> NUMBER_LITERAL ]]() =
    *  <pushf> expression.value
    */
    @Override
    public Void visit(NumberLiteral n, Void param) {
        codeGenerator.push(n.getValue());
        return null;
    }

    /*
    * value[[ Arithmetic: expression1 -> expression2 expression3 ]]() =
    *   value[[ expression2 ]]()
    *   cg.convertTo(expression2.type, expression1.type)
    *   value[[ expression3 ]]()
    *   cg.convertTo(expression3.type, expression1.type)
    *   cg.arithmetic(expression1.operator, expression1.type)
    */
    @Override
    public Void visit(Arithmetic a, Void param) {
        a.getLeft().accept(this, param);
        codeGenerator.convertTo(a.getLeft().getType(), a.getType());
        a.getRight().accept(this, param);
        codeGenerator.convertTo(a.getRight().getType(), a.getType());
        codeGenerator.arithmetic(a.getOperator(), a.getType());
        return null;
    }

    /*
    * value [[ Comparison: expression1 -> expression2 expression3 ]]() =
    *   value[[ expression2 ]]()
    *   cg.convertTo(expression2.type, expression1.type)
    *   value[[ expression3 ]]()
    *   cg.convertTo(expression3.type, expression1.type)
    *   cg.comparison(expression1.operator, expression1.type)
    */
    @Override
    public Void visit(Comparison c, Void param) {
        Type superType = c.getLeft().getType().superType(c.getRight().getType(), c);
        c.getLeft().accept(this, param);
        codeGenerator.convertTo(c.getLeft().getType(), superType);
        c.getRight().accept(this, param);
        codeGenerator.convertTo(c.getRight().getType(), superType);
        codeGenerator.comparison(c.getOperator(), superType);
        return null;
    }

    /*
    * value[[ Logic: expression1 -> expression2 expression3 ]]() =
    *   value[[ expression2 ]]()
    *   value[[ expression3 ]]()
    *   cg.logic(expression1.operator)
    */
    @Override
    public Void visit(Logic l, Void param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        codeGenerator.logic(l.getOperator());
        return null;
    }
    /*
     * value[[ Cast: expression1 -> expression2 type ]]() =
     *   value[[ expression2 ]]()
     *   cg.convertTo(expression2.type, type)
     */
    @Override
    public Void visit(Cast c, Void param) {
        c.getExpression().accept(this, param);
        codeGenerator.convertTo(c.getExpression().getType(), c.getType());
        return null;
    }

    /*
     * value[[ UnaryNot: expression1 -> expression2 ]]() =
     *   value[[ expression2 ]]()
     *   <not>
     */
    @Override
    public Void visit(UnaryNot un, Void param) {
        un.getExpression().accept(this, param);
        codeGenerator.not();
        return null;
    }

    /*
     * value[[ UnaryMinus: expression1 -> expression2 ]]() =
     *   value[[ expression2 ]]
     *   cg.convertTo(expression2.type, expression1.type)
     *   <pushi> -1
     *   cg.convertTo(IntType, expression1.type)
     *   <mul> expression1.type.suffix()
     */
    @Override
    public Void visit(UnaryMinus um, Void param) {
        um.getExpression().accept(this, param);
        codeGenerator.convertTo(um.getExpression().getType(), um.getType());
        codeGenerator.push(-1);
        codeGenerator.convertTo(IntType.getInstance(), um.getType());
        codeGenerator.mul(um.getType());
        return null;
    }


    /*
     * value[[ ArrayAccess: expression1 -> expression2 expression3 ]]() =
     *   address[[ expression1 ]]()
     *   <load> expression1.type.suffix()
     */
    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.accept(addressCGVisitor, param);
        codeGenerator.load(a.getType());
        return null;
    }

    /*
     * value[[ StructAccess: expression1 -> expression2 ID ]]() =
     *   address[[ expression1 ]]()
     *   <load> expression1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess f, Void param) {
        f.accept(addressCGVisitor, param);
        codeGenerator.load(f.getType());
        return null;
    }

    /*
     * value[[ FunctionInvocation: expression1 -> expression2 expression3* ]]() =
     *   exp3*.forEach( exp -> value[[ exp ]])
	 *   <call> exp2.name
     */
    @Override
    public Void visit(FunctionInvocation f, Void param) {
        f.getExpressionList().forEach(exp -> exp.accept(this, param));
        codeGenerator.call(f.getVariable().getName());
        return null;
    }

}
