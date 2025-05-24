package codegeneration;

import ast.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
// LAB 11
public class CodeGenerator extends AbstractCGVisitor<Void, Void> {
    private PrintWriter out;

    private int labels;

    public CodeGenerator(String outputFileName, String inputFileName) throws FileNotFoundException {
        this.out = new PrintWriter(outputFileName);
        source(inputFileName);
    }


    public void call(String function) {
        out.println("\tcall\t"+function);
        out.flush();
    }

    public void callMain() {
        this.out.println("\n' Invocation to the main function");
        this.out.println("call main");
        this.out.flush();
    }

    public void load(Type type)
    {
        out.println("\tload" + type.suffix());
        out.flush();
    }
    public void store(Type type)
    {
        out.println("\tstore" + type.suffix());
        out.flush();
    }
    public void halt(){
        out.println("halt\n");
        out.flush();
    }

    public void in(Type type) {
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void out(Type type) {
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void ret(int bytesReturn, int bytesLocals, int bytesParams) {
        this.out.println("\tret\t" + bytesReturn + ", " + bytesLocals + ", " + bytesParams);
        this.out.flush();

    }

    // Push instructions
    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    public void push(char charConstant) {
        out.println("\tpushb\t" + (int) charConstant);
        out.flush();
    }

    public void push(int intConstant) {
        out.println("\tpushi\t" + intConstant);
        out.flush();
    }

    public void push(double realConstant) {
        out.println("\tpushf\t" + realConstant);
        out.flush();
    }

    public void pusha(int intConstant) {
        out.println("\tpusha\t" + intConstant);
        out.flush();
    }

    // Arithmetic instructions and operations
    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+": add(type); break;
            case "-": sub(type); break;
            case "*": mul(type); break;
            case "/": div(type); break;
            case "%": mod(type); break;
        }
    }

    public void add(Type type) {
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void sub(Type type) {
        out.println("\tsub" + type.suffix());
        out.flush();
    }

    public void mul(Type type) {
        out.println("\tmul" + type.suffix());
        out.flush();
    }

    public void div(Type type) {
        out.println("\tdiv" + type.suffix());
        out.flush();
    }

    public void mod(Type type) {
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    // Prints
    public void printFunction(String functionName) {
        out.println("\n " + functionName + ":");
        out.flush();
    }
    public void printComment(String comment) {
        out.println("\t' * " + comment);
        out.flush();
    }

    public void printLine(int line) {
        this.out.println("\n#line\t" + line);
        this.out.flush();
    }

    private void source(String inputFileName) {
        this.out.println("\n#source\t" + "\"" + inputFileName + "\"\n");
        this.out.flush();
    }

    public void enter(int i) {
        out.println("\tenter\t" + i);
        out.flush();
    }

    public void convertTo(Type type2, Type type1) {
        if(type2.suffix() != type1.suffix()){
            out.println("\t" + type2.suffix() + "2" + type1.suffix());
            out.flush();
        }
    }

    public void logic(String operator) {
        String operation = switch (operator) {
            case "&&" -> "and";
            case "||" -> "or";
            default -> "";
        };
        out.println("\t" + operation);
        out.flush();
    }

    public void comparison(String operator, Type type) {
        String operation = switch (operator) {
            case ">" -> "gt";
            case "<" -> "lt";
            case ">=" -> "ge";
            case "<=" -> "le";
            case "==" -> "eq";
            case "!=" -> "ne";
            default -> "";
        };
        out.println("\t" + operation + type.suffix());
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public int getLabels(int numberOfLabels){
        int temp = labels;
        labels += numberOfLabels;
        return temp;
    }

    public void label(int number){
        out.println(" label"+number+":");
        out.flush();
    }

    public void jmp(int number) {
        out.println("\tjmp\tlabel" + number);
        out.flush();
    }

    public void jz(int number) {
        out.println("\tjz\tlabel" + number);
        out.flush();
    }

    public void jnz(int number) {
        out.println("\tjnz\tlabel" + number);
        out.flush();
    }

    public void pop(char suffix) {
        out.println("\tpop" + suffix);
        out.flush();
    }
}
