package ast;

import ast.locatables.Definition;

import java.util.List;

public class Program implements ASTNode{

    private final List<Definition> definitions;

    public Program(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
}
