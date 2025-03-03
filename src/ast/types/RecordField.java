package ast.types;

import ast.Type;
import ast.definitions.AbstractDefinition;

import java.util.List;

public class RecordField extends AbstractDefinition {

    private Type type;

    public RecordField(int line, int column, Type type, String name) {
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
