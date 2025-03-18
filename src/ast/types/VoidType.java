package ast.types;

import ast.Type;
import ast.Visitor;

public class VoidType implements Type {
    private static final VoidType INSTANCE = new VoidType();

    private VoidType() {}

    public static VoidType getInstance() {
        return INSTANCE;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
