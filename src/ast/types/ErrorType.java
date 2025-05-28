package ast.types;

import ast.ErrorHandler;
import ast.Locatable;
import ast.Type;
import ast.Visitor;

//wrong input 1 obligatorio, el 2 se hace la próxima semana
public class ErrorType extends AbstractType {
    private final String message;
    private final Locatable location;

    public ErrorType(String message, Locatable location) {
        this.message = message;
        this.location = location;
        ErrorHandler.getInstance().addError(this);
    }

    public String toString() {
        return "Line: " + location.getLine() +
                ", Column: " + location.getColumn() +
                ", Message: " + message;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public void mustBeLogical(Locatable l){
        // Empty
    }

    @Override
    public void mustBeBuiltIn(Locatable l){
        // Empty
    }

    @Override
    public void mustPromoteTo(Type t, Locatable l){
        // Empty
    }

    public Locatable getLocation() {
        return location;
    }
}
