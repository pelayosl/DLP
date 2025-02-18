package ast.expressions;

import ast.Expression;

public class FieldAccess implements Expression {

    private Expression expression;
    private String field;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
