package ast.types;

import ast.Type;
import ast.Visitor;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;

import java.util.List;

public class FunctionType implements Type {

    private Type returnType;
    private List<Definition> varDefinitionList;

    public FunctionType(Type returnType, List<Definition> varDefinitionList) {
        this.returnType = returnType;
        this.varDefinitionList = varDefinitionList;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<Definition> getVarDefinitionList() {
        return varDefinitionList;
    }

    public void setVarDefinitionList(List<Definition> varDefinitionList) {
        this.varDefinitionList = varDefinitionList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
