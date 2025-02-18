package ast.statements;

import ast.Expression;
import ast.locatables.Statement;

import java.util.List;

public class Assignment implements Statement {
    private List<Expression> expressionList;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
