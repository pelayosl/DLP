package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

public class ReadStatement extends AbstractStatement {

    private Expression expression;

    public ReadStatement(int line, int column, Expression expression) {
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
