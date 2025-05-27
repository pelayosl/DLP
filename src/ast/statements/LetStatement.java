package ast.statements;

import ast.Type;
import ast.Visitor;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatables.Expression;

public class LetStatement extends VarDefinition {

    private Expression value;
    private Variable var;

    public LetStatement(int line, int column, Type type, String name, Variable var, Expression value) {
        super(line, column, type, name);
        this.value = value;
        this.var = var;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public Variable getVar() {
        return var;
    }

    public void setVar(Variable var) {
        this.var = var;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
