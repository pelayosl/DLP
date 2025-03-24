package ast.semantic;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{
    private final SymbolTable symbolTable = new SymbolTable();

    @Override
    public Void visit(FuncDefinition f, Void param) {
        if(!symbolTable.insert(f)){
            new ErrorType("Function '" + f.getName() + "' already defined", f);
        }
        symbolTable.set();
        super.visit(f, param);
        symbolTable.reset();
        return null;
    }

    @Override
    public Void visit(VarDefinition v, Void param) {
        super.visit(v, param);
        if(!symbolTable.insert(v)){
            new ErrorType("Variable '" + v.getName() + "' already defined", v);
        }
        return null;
    }

    @Override
    public Void visit(Variable v, Void param){
        super.visit(v, param);
        if(symbolTable.find(v.getName()) == null){
            new ErrorType("Definition for name '" + v.getName() + "' not found", v);
        }
        return null;
    }
}
