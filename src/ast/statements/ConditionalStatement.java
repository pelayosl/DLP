package ast.statements;

import ast.Visitor;
import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement extends AbstractStatement {

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;
    private Expression comparison; // should be condition...

    public ConditionalStatement(int line, int column, List<Statement> ifStatements, List<Statement> elseStatements, Expression comparison) {
        super(line, column);
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
        this.comparison = comparison;

    }

    public ConditionalStatement(int line, int column, List<Statement> ifStatements, Expression comparison) {
        super(line, column);
        this.ifStatements = ifStatements;
        this.elseStatements = new ArrayList<Statement>();
        this.comparison = comparison;

    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Statement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Statement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    public Expression getComparison() {
        return comparison;
    }

    public void setComparison(Expression comparison) {
        this.comparison = comparison;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
