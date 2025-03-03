package ast.locatables;

import ast.Locatable;

public abstract class AbstractLocatable implements Locatable {

    private final int line;
    private final int column;

    public AbstractLocatable(int line, int column) {
        this.line = line;
        this.column = column;
    }
    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
