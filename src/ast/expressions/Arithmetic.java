package ast.expressions;

import ast.locatables.Expression;

public class Arithmetic extends AbstractExpression {

    private final Expression left;
    private final Expression right;
    private final String operator;

    public Arithmetic(int line, int column, String operator, Expression left, Expression right) {
        super(line, column);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

}
