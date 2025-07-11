package ast.expressions;

import ast.Visitor;
import ast.locatables.Expression;

public class Comparison extends AbstractExpression {

    private Expression left, right;
    private String operator;

    public Comparison(int line, int column, String operator, Expression left, Expression right) {
        super(line, column);
        this.operator = operator;
        this.left = left;
        this.right = right;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
