package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

public class CharType extends AbstractType {

    private static final CharType INSTANCE = new CharType();

    private CharType() {}

    public static CharType getInstance() {
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
    public int numberOfBytes() {
        return 1;
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
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        // Empty because it is built in
    }

    @Override
    public void mustPromoteTo(Type otherType, Locatable l) {
        if(!(otherType instanceof IntType || otherType instanceof CharType || otherType instanceof NumberType))
            super.mustPromoteTo(otherType, l);
    }

}
