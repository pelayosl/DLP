package ast.expressions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Expression;

import java.util.AbstractCollection;

public abstract class AbstractExpression extends AbstractLocatable implements Expression {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
