package ast.statements;

import ast.Expression;
import ast.locatables.Statement;

import java.util.List;

public class ConditionalStatement implements Statement {

    private Statement ifStatement;
    private Statement elseStatement;
    private Expression comparison;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
