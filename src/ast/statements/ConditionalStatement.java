package ast.statements;

import ast.locatables.Expression;
import ast.locatables.Statement;

import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement extends AbstractStatement {

    private List<Statement> ifStatement;
    private List<Statement> elseStatement;

    public ConditionalStatement(int line, int column, List<Statement> ifStatement, List<Statement> elseStatement, Expression comparison) {
        super(line, column);
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
        this.comparison = comparison;

    }

    public ConditionalStatement(int line, int column, List<Statement> ifStatement, Expression comparison) {
        super(line, column);
        this.ifStatement = ifStatement;
        this.elseStatement = new ArrayList<Statement>();
        this.comparison = comparison;

    }

    public List<Statement> getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(List<Statement> ifStatement) {
        this.ifStatement = ifStatement;
    }

    public List<Statement> getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(List<Statement> elseStatement) {
        this.elseStatement = elseStatement;
    }

    public Expression getComparison() {
        return comparison;
    }

    public void setComparison(Expression comparison) {
        this.comparison = comparison;
    }

    private Expression comparison;

}
