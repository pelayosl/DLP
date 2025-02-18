package ast.types;

import ast.Type;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType implements Type {

    private Type returnType;
    private FuncDefinition func;
    private List<VarDefinition> varDefinitionList;

}
