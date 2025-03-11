package ast.types;

import ast.Locatable;
import ast.Type;

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
}
