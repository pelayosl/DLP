package ast.expressions;

import ast.Visitor;

public class IntLiteral extends AbstractExpression {

    private final int value;

    public IntLiteral(int line, int column, int value) {
        super(line,column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
