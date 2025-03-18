package ast.statements;

import ast.ErrorHandler;
import ast.Visitor;
import ast.locatables.*;

public abstract class AbstractStatement extends AbstractLocatable implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
