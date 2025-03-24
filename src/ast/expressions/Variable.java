package ast.expressions;

import ast.Visitor;
import ast.locatables.Definition;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition; // Lab 8

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
