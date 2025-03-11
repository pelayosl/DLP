package ast.statements;

import ast.ErrorHandler;
import ast.locatables.*;

public class AbstractStatement extends AbstractLocatable implements Statement {
    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
