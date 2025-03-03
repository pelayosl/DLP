package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class WhileStatement extends AbstractStatement {

    private Expression condition;
    private List<Statement> statementList;

    public WhileStatement(int line, int column, Expression condition, List<Statement> statementList) {
        super(line, column);
        this.condition = condition;
        this.statementList = statementList;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }
}
