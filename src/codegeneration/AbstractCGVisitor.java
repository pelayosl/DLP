package codegeneration;

import ast.Program;
import ast.Visitor;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractCGVisitor<TR, TP> implements Visitor<TR, TP> {
    @Override
    public TR visit(Variable v, TP param) {
        throw new IllegalStateException("Illegal access to Variable: " + this.getClass().getName());
    }

    @Override
    public TR visit(Arithmetic a, TP param) {
        throw new IllegalStateException("Illegal access to Arithmetic");
    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        throw new IllegalStateException("Illegal access to ArrayAccess");
    }

    @Override
    public TR visit(FieldAccess f, TP param) {
        throw new IllegalStateException("Illegal access to FieldAccess");
    }

    @Override
    public TR visit(Cast f, TP param) {
        throw new IllegalStateException("Illegal access to Cast");
    }

    @Override
    public TR visit(CharLiteral f, TP param) {
        throw new IllegalStateException("Illegal access to CharLiteral");
    }

    @Override
    public TR visit(IntLiteral f, TP param) {
        throw new IllegalStateException("Illegal access to IntLiteral");
    }

    @Override
    public TR visit(Comparison f, TP param) {
        throw new IllegalStateException("Illegal access to Comparison");
    }

    @Override
    public TR visit(UnaryMinus f, TP param) {
        throw new IllegalStateException("Illegal access to UnaryMinus");
    }

    @Override
    public TR visit(UnaryNot f, TP param) {
        throw new IllegalStateException("Illegal access to UnaryNot");
    }

    @Override
    public TR visit(Logic f, TP param) {
        throw new IllegalStateException("Illegal access to Logic");
    }

    @Override
    public TR visit(NumberLiteral f, TP param) {
        throw new IllegalStateException("Illegal access to NumberLiteral");
    }

    @Override
    public TR visit(Program p, TP param) {
        throw new IllegalStateException("Illegal access to Program");
    }

    @Override
    public TR visit(Assignment p, TP param) {
        throw new IllegalStateException("Illegal access to Assignment");
    }

    @Override
    public TR visit(ConditionalStatement p, TP param) {
        throw new IllegalStateException("Illegal access to ConditionalStatement");
    }

    @Override
    public TR visit(FunctionInvocation p, TP param) {
        throw new IllegalStateException("Illegal access to Function");
    }

    @Override
    public TR visit(ReadStatement p, TP param) {
        throw new IllegalStateException("Illegal access to ReadStatement");
    }

    @Override
    public TR visit(ReturnStatement p, TP param) {
        throw new IllegalStateException("Illegal access to ReturnStatement");
    }

    @Override
    public TR visit(WhileStatement p, TP param) {
        throw new IllegalStateException("Illegal access to WhileStatement");
    }

    @Override
    public TR visit(WriteStatement p, TP param) {
        throw new IllegalStateException("Illegal access to WriteStatement");
    }

    @Override
    public TR visit(LetStatement p, TP param) {
        throw new IllegalStateException("Illegal access to LetStatement");
    }

    @Override
    public TR visit(ArrayType p, TP param) {
        throw new IllegalStateException("Illegal access to ArrayType");
    }

    @Override
    public TR visit(CharType p, TP param) {
        throw new IllegalStateException("Illegal access to CharType");
    }

    @Override
    public TR visit(ErrorType p, TP param) {
        throw new IllegalStateException("Illegal access to ErrorType");
    }

    @Override
    public TR visit(FunctionType p, TP param) {
        throw new IllegalStateException("Illegal access to FunctionType");
    }

    @Override
    public TR visit(IntType p, TP param) {
        throw new IllegalStateException("Illegal access to IntType");
    }

    @Override
    public TR visit(NumberType p, TP param) {
        throw new IllegalStateException("Illegal access to NumberType");
    }

    @Override
    public TR visit(RecordType p, TP param) {
        throw new IllegalStateException("Illegal access to RecordType");
    }

    @Override
    public TR visit(VoidType p, TP param) {
        throw new IllegalStateException("Illegal access to VoidType");
    }

    @Override
    public TR visit(RecordField p, TP param) {
        throw new IllegalStateException("Illegal access to RecordField");
    }

    @Override
    public TR visit(FuncDefinition funcDefinition, TP param) {
        throw new IllegalStateException("Illegal access to FuncDefinition");
    }

    @Override
    public TR visit(VarDefinition varDefinition, TP param) {
        throw new IllegalStateException("Illegal access to VarDefinition");
    }
}
