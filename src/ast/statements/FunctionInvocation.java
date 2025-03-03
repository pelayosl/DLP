package ast.statements;

import ast.expressions.AbstractExpression;
import ast.locatables.Expression;
import ast.expressions.Variable;
import ast.locatables.Statement;

import java.util.List;

public class FunctionInvocation extends AbstractStatement implements Expression {

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



}
