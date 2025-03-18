package ast.expressions;

import ast.Visitor;
import ast.locatables.Expression;

public class FieldAccess extends AbstractExpression {

    private Expression expression;
    private String field;

    public FieldAccess(int line, int column, Expression expression, String field) {
        super(line, column);
        this.expression = expression;
        this.field = field;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
