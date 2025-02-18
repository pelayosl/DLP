package ast.expressions;

import ast.Expression;

public class Comparison implements Expression {

    private Expression left, right;
    private String operator;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
