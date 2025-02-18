package ast;

import ast.locatables.Definition;

import java.util.List;

public class Program implements ASTNode{

    private List<Definition> definitionList;
    private Type type;
}
