package ast.locatables;

import ast.Locatable;
import ast.Type;

import java.util.List;

public interface Definition extends Locatable {
    public String getName();
    public Type getType();
    public int getScope();
    public void setScope(int scope);
}
