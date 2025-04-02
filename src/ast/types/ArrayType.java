package ast.types;

import ast.Locatable;
import ast.Type;
import ast.Visitor;

public class ArrayType extends AbstractType {

    private Type type;
    private int size;

    // se usa int para saber cuanto va a ocupar en memoria
    public ArrayType(Type type, int size) {
        this.type = type;
        this.size = size;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int numberOfBytes() {
        return type.numberOfBytes()*size;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public void mustBeLogical(Locatable l){
        if(type != IntType.getInstance()) {
            super.mustBeLogical(l);
        }
    }

    @Override
    public Type squareBrackets(Type t, Locatable l){
        if (!(t instanceof IntType)) {
            return super.squareBrackets(t, l);
        }
        return this.type;
    }

}
