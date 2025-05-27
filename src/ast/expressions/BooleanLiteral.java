package ast.expressions;

import ast.Visitor;

public class BooleanLiteral extends AbstractExpression {

    private boolean value;
    public BooleanLiteral(int line, int column, boolean value) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        v.visit(this, param);
        return null;
    }
}
