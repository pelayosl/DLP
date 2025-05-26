package ast;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import examples.ast.Write;

public interface Visitor<RT, PT> {
    // Expressions
    RT visit(Variable v, PT param);
    RT visit(Arithmetic a, PT param);
    RT visit(ArrayAccess a, PT param);
    RT visit(FieldAccess f, PT param);
    RT visit(Cast f, PT param);
    RT visit(CharLiteral f, PT param);
    RT visit(IntLiteral f, PT param);
    RT visit(Comparison f, PT param);
    RT visit(UnaryMinus f, PT param);
    RT visit(UnaryNot f, PT param);
    RT visit(Logic f, PT param);
    RT visit(NumberLiteral f, PT param);
    RT visit(TernaryOperator op, PT param);

    // Program
    RT visit(Program p, PT param);

    // Statements
    RT visit(Assignment p, PT param);
    RT visit(ConditionalStatement p, PT param);
    RT visit(FunctionInvocation p, PT param);
    RT visit(ReadStatement p, PT param);
    RT visit(ReturnStatement p, PT param);
    RT visit(WhileStatement p, PT param);
    RT visit(WriteStatement p, PT param);

    // Types
    RT visit(ArrayType p, PT param);
    RT visit(CharType p, PT param);
    RT visit(ErrorType p, PT param);
    RT visit(FunctionType p, PT param);
    RT visit(IntType p, PT param);
    RT visit(NumberType p, PT param);
    RT visit(RecordType p, PT param);
    RT visit(VoidType p, PT param);

    // RecordField
    RT visit(RecordField p, PT param);

    RT visit(FuncDefinition funcDefinition, PT param);

    RT visit(VarDefinition varDefinition, PT param);
}
