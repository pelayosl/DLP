package ast.definitions;

import ast.Type;
import ast.locatables.Definition;
import ast.locatables.Statement;

import java.util.List;

public class FuncDefinition implements Definition {

    private List<Statement> statementList;
    private Type returnType;

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
