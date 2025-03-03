package ast.types;

import ast.Type;

public class ArrayType implements Type {

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
}
