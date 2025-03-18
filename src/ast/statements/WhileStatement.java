package ast.statements;

import ast.Visitor;
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

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
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
