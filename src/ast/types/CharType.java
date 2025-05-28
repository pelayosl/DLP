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
        if(otherType instanceof CharType)
            return IntType.getInstance();
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.arithmetic(otherType, l);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return IntType.getInstance();
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public Type comparison(Type otherType, Locatable l){
        if(otherType instanceof CharType)
            return IntType.getInstance();
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.comparison(otherType, l);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof CharType) {
            return t;
        }
        return super.logic(t, l);
    }


    @Override
    public void mustBeBuiltIn(Locatable l) {
        // Empty because it is built in
    }

    @Override
    public void mustPromoteTo(Type otherType, Locatable l) {
        if(!(otherType instanceof CharType || otherType instanceof ErrorType))
            super.mustPromoteTo(otherType, l);
    }

    @Override
    public Type canBeCastTo(Type otherType, Locatable l){
        if(otherType instanceof IntType || otherType instanceof CharType || otherType instanceof NumberType)
            return otherType;
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.canBeCastTo(otherType, l);
    }

    @Override
    public Type superType(Type otherType, Locatable l) {
        return IntType.getInstance();
    }

    @Override
    public String toString(){
        return "CharType";
    }

    @Override
    public char suffix(){
        return 'b';
    }
}
