package ast.expressions;

import ast.locatables.Expression;

public class NumberLiteral extends AbstractExpression {

    private final double value;

    public NumberLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
