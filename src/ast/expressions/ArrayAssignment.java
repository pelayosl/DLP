package ast.expressions;

import ast.Visitor;
import ast.locatables.Expression;

import java.util.List;

public class ArrayAssignment extends AbstractExpression{
    private List<Expression> expressionList;

    public ArrayAssignment(int line, int column, List<Expression> expressionList) {
        super(line, column);
        this.expressionList = expressionList;
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        v.visit(this, param);
        return null;
    }
}
