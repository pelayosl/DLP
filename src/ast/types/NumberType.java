package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

public class NumberType extends AbstractType {

    private static final NumberType INSTANCE = new NumberType();

    private NumberType() {}

    public static NumberType getInstance() {
        return INSTANCE;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public Type arithmetic(Type otherType, Locatable l){
        if(otherType instanceof IntType || otherType instanceof CharType || otherType instanceof NumberType)
            return this;
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.arithmetic(otherType, l);
    }

    @Override
    public Type arithmetic(Locatable l){
        return this;
    }

    @Override
    public Type comparison(Type otherType, Locatable l){
        if(otherType instanceof IntType || otherType instanceof CharType || otherType instanceof NumberType)
            return this;
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.comparison(otherType, l);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        // Empty because it is built in
    }

    @Override
    public void mustPromoteTo(Type otherType, Locatable l) {
        if(!(otherType instanceof NumberType))
            super.mustPromoteTo(otherType, l);
    }

}
