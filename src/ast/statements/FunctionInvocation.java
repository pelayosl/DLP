package ast.statements;

import ast.Type;
import ast.Visitor;
import ast.expressions.AbstractExpression;
import ast.locatables.Expression;
import ast.expressions.Variable;
import ast.locatables.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {

    private Type type; // Lab 9

    private Variable variable;
    private List<Expression> expressionList;

    public FunctionInvocation(int line, int column, Variable variable, List<Expression> expressionList) {
        super(line, column);
        this.variable = variable;
        this.expressionList = expressionList;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public boolean getLvalue() {
        return false;
    }

    @Override
    public void setLvalue(boolean lvalue) {

    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }
}
