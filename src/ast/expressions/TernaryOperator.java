package ast.expressions;

import ast.Visitor;
import ast.locatables.Expression;

public class TernaryOperator extends AbstractExpression{

    private Expression condition, left, right;

    public TernaryOperator(int line, int column, Expression condition, Expression left, Expression right) {
        super(line, column);
        this.condition = condition;
        this.left = left;
        this.right = right;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
