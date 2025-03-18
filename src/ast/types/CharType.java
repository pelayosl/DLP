package ast.types;

import ast.Type;
import ast.Visitor;

public class CharType implements Type {

    private static final CharType INSTANCE = new CharType();

    private CharType() {}

    public static CharType getInstance() {
        return INSTANCE;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
