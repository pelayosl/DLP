package ast.types;

import ast.Locatable;
import ast.Visitor;

public class VoidType extends AbstractType {
    private static final VoidType INSTANCE = new VoidType();

    private VoidType() {}

    public static VoidType getInstance() {
        return INSTANCE;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        // Empty because void functions are allowed, even though VoidType is not built in
    }
}
