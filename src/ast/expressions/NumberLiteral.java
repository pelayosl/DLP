package ast.expressions;

import ast.Expression;

public class NumberLiteral implements Expression {

    private double value;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
