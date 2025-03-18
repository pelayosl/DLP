package ast.statements;

import ast.Visitor;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.List;

public class Assignment extends AbstractStatement {
    private Expression expression1;
    private Expression expression2;

    public Assignment(int line, int column, Expression expression1, Expression expression2) {
        super(line, column);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }


    public Expression getExpression1() {
        return expression1;
    }

    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }

    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
