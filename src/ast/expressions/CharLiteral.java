package ast.expressions;

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
}
