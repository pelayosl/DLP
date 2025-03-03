package ast.definitions;

import ast.Type;
import ast.locatables.Definition;
import ast.locatables.Statement;

public class VarDefinition extends AbstractDefinition implements Statement {

    private Type type;

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, name);
        this.type = type;

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
