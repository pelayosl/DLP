package ast.types;

import ast.Type;
import ast.Visitor;
import ast.definitions.AbstractDefinition;

import java.util.List;

public class RecordField extends AbstractDefinition {


    public RecordField(int line, int column, Type type, String name) {
        super(line, column, name, type);
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
