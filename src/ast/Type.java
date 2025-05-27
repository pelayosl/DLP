package ast;

import ast.locatables.Expression;

import java.util.List;

public interface Type extends ASTNode{
    public void mustBeBuiltIn(Locatable l);
    public void mustBeLogical(Locatable l);
    public Type arithmetic(Type t, Locatable l);
    public Type arithmetic(Locatable l);
    public Type logic(Type t, Locatable l);
    public Type logic(Locatable l);
    public void mustPromoteTo(Type t, Locatable l);
    public Type canBeCastTo(Type t, Locatable l);
    public Type comparison(Type t, Locatable l);
    public Type squareBrackets(Type t, Locatable l);
    public Type dot(String s, Locatable l);
    public Type parenthesis(List<Type> types, Locatable l);

    // OffsetVisitor
    public int numberOfBytes();

    // CGVisitor
    public char suffix();

    public Type superType(Type type, Locatable l);

    public void mustBeAssignable(Expression e, Locatable l);
}
