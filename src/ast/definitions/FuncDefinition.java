package ast.definitions;

import ast.Type;
import ast.Visitor;
import ast.locatables.Definition;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {
    private List<Statement> statementList;
    private List<Definition> variablesList;

    public FuncDefinition(int line, int column, List<Definition> variablesList,
                          List<Statement> statementList, Type functionType, String name) {
        super(line, column, name, functionType);
        this.statementList = statementList;
        this.variablesList = variablesList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public List<Definition> getVariablesList() {
        return variablesList;
    }

    public int localBytesSum() {
        if(variablesList.isEmpty())
            return 0;
        return -((VarDefinition) variablesList.getLast()).getOffset();
    }

    public void setVariablesList(List<Definition> variablesList) {
        this.variablesList = variablesList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
