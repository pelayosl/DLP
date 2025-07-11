package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<Definition> varDefinitionList;

    private int paramBytesSum, returnBytesSum;

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

    @Override
    public Type parenthesis(List<Type> argTypes, Locatable l) {
        if (argTypes.size() != varDefinitionList.size()) {
            return new ErrorType("Function called with wrong number of arguments", l);
        }

        for (int i = 0; i < varDefinitionList.size(); i++) {
            if (!argTypes.get(i).equals(varDefinitionList.get(i).getType())) {
                return new ErrorType("Argument " + (i+1) + " type mismatch: " +
                        "expected " + varDefinitionList.get(i).getType().toString() + " but received " +
                        argTypes.get(i), l);
            }
        }

        return returnType;
    }

    @Override
    public void mustBeBuiltIn(Locatable l){
        if(returnType != VoidType.getInstance()) // We allow void type functions
            returnType.mustBeBuiltIn(l);
    }

    @Override
    public String toString(){
        return "FunctionType";
    }

    public int getReturnBytesSum() {
        return returnBytesSum;
    }

    public int getParamBytesSum() {
        return paramBytesSum;
    }

    public void setReturnBytesSum(int returnBytesSum) {
        this.returnBytesSum = returnBytesSum;
    }

    public void setParamBytesSum(int paramBytesSum) {
        this.paramBytesSum = paramBytesSum;
    }

}
