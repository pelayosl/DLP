package ast.definitions;

import ast.Type;
import ast.Visitor;
import ast.locatables.Definition;
import ast.locatables.Statement;

public class VarDefinition extends AbstractDefinition implements Statement {

    private int offset;
    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, name, type);

    }

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column, name, type);

    }
    public int getOffset(){
        return offset;
    }
    public void setOffset(int offset){
        this.offset = offset;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
