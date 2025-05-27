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
        if(otherType instanceof NumberType)
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
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public Type comparison(Type otherType, Locatable l){
        if(otherType instanceof NumberType)
            return IntType.getInstance();
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

    @Override
    public Type superType(Type otherType, Locatable l) {
        return this;
    }

    @Override
    public Type logic(Locatable l) {
        return this;
    }

    @Override
    public Type logic(Type t, Locatable l) {
        if (t instanceof NumberType) {
            return t;
        }
        return super.logic(t, l);
    }

    @Override
    public Type assignable(Locatable l) {
        return this;
    }

    @Override
    public String toString(){
        return "RealType";
    }

    @Override
    public char suffix(){
        return 'f';
    }

    @Override
    public Type canBeCastTo(Type otherType, Locatable l){
        if(otherType instanceof NumberType || otherType instanceof IntType)
            return otherType;
        if(otherType instanceof ErrorType){
            return otherType;
        }
        return super.canBeCastTo(otherType, l);
    }

}
