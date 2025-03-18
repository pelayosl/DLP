package ast.expressions;

import ast.Visitor;
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

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
