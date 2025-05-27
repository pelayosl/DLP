package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

public class BooleanType extends AbstractType{
    private static final BooleanType INSTANCE = new BooleanType();

    private BooleanType() {}

    public static BooleanType getInstance() {
        return INSTANCE;
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        // Empty because it is built in
    }

    @Override
    public void mustPromoteTo(Type otherType, Locatable l) {
        if(!(otherType instanceof BooleanType))
            super.mustPromoteTo(otherType, l);
    }

    @Override
    public String toString(){
        return "BooleanType";
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof BooleanType) {
            return t;
        }
        return super.logic(t, l);
    }

    @Override
    public void mustBeLogical(Locatable l){
        // Empty because it is logical
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix(){
        return 'i';
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
