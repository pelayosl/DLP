package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

//wrong input 1 obligatorio, el 2 se hace la próxima semana
public class ErrorType implements Type {
    private final String message;
    private final Locatable location;

    public ErrorType(String message, Locatable location) {
        this.message = message;
        this.location = location;
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
}
