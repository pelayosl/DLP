package ast.expressions;

public class IntLiteral extends AbstractExpression {

    private final int value;

    public IntLiteral(int line, int column, int value) {
        super(line,column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
