package ast.definitions;

import ast.Type;
import ast.locatables.Definition;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private List<Statement> statementList;
    private List<VarDefinition> variablesList;
    private Type functionType;

    public FuncDefinition(int line, int column, List<Definition> variablesList,
                          List<Statement> statementList, Type functionType, String name) {
        super(line, column, name);
        this.statementList = statementList;
        this.functionType = functionType;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public Type getFunctionType() {
        return functionType;
    }

    public void setFunctionType(Type returnType) {
        this.functionType = returnType;
    }

}
