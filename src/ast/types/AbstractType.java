package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

import java.util.List;

public abstract class AbstractType implements Type {
    @Override
    public void mustBeBuiltIn(Locatable l) {
        new ErrorType("Type must be a built-in type", l);
    }

    @Override
    public void mustBeLogical(Locatable l) {
        new ErrorType("Expression is not a valid logical operation", l);
    }

    @Override
    public Type arithmetic(Type t, Locatable l) {
        return new ErrorType("Expression is not arithmetic", l);
    }

    @Override
    public Type arithmetic(Locatable l) {
        return new ErrorType("Expression is not arithmetic", l);
    }

    @Override
    public Type logic(Type t, Locatable l) {
        return new ErrorType("Expression is not logic", l);
    }

    @Override
    public Type logic(Locatable l) {
        return new ErrorType("Expression is not logic", l);
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l) {
        new ErrorType("Type " + this.getClass() + " not promotable to type " + t.getClass(), l);
    }

    @Override
    public Type canBeCastedTo(Type t, Locatable l) {
        return new ErrorType("Type " + this.getClass() + " cannot be casted to " + t, l);
    }

    @Override
    public Type comparison(Type t, Locatable l) {
        return new ErrorType("Invalid types for a comparison", l);
    }

    @Override
    public Type squareBrackets(Type t, Locatable l) {
        return new ErrorType("Invalid type for an array index", l);
    }

    @Override
    public Type dot(String s, Locatable l) {
        return new ErrorType("Field " + s + " not found in record", l);
    }

    @Override
    public Type parenthesis(List<Type> types, Locatable l) {
        return null;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return null;
    }
}
