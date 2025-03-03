package ast.definitions;

import ast.locatables.AbstractLocatable;
import ast.locatables.Definition;

public abstract class AbstractDefinition extends AbstractLocatable implements Definition {

    private String name;

    public AbstractDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
