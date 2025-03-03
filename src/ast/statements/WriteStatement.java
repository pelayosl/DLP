package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

public class WriteStatement extends AbstractStatement {

    private Expression expression;

    public WriteStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
