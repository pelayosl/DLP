package ast.statements;

import ast.Expression;
import ast.locatables.Statement;

import java.util.List;

public class WhileStatement implements Statement {

    private Expression condition;
    private List<Statement> statementList;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
