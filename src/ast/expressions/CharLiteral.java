package ast.expressions;

import ast.Visitor;
import ast.locatables.Expression;

public class CharLiteral extends AbstractExpression {

    private final char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
