package ast.definitions;

import ast.Type;
import ast.Visitor;
import ast.locatables.Definition;
import ast.locatables.Expression;
import ast.locatables.Statement;

public class VarDefinition extends AbstractDefinition implements Statement {

    private int offset;
    private Expression value;

    public VarDefinition(int line, int column, Type type, String name) {
        super(line, column, name, type);
    }
    public VarDefinition(int line, int column, Type type, String name, Expression value) {
        super(line, column, name, type);
        this.value = value;
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

    public Expression getValue(){return value;}

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
