package ast.types;

import ast.Type;
import ast.definitions.AbstractDefinition;

import java.util.List;

public class RecordField extends AbstractDefinition {


    public RecordField(int line, int column, Type type, String name) {
        super(line, column, name, type);
    }

}
