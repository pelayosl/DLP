package ast.semantic;

import ast.Program;
import ast.Visitor;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractVisitor<RT, PT> implements Visitor<RT, PT> {
    @Override
    public RT visit(Variable v, PT param) {
        return null;
    }

    @Override
    public RT visit(Arithmetic a, PT param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayAccess a, PT param) {
        a.getArray().accept(this, param);
        a.getIndex().accept(this, param);
        return null;
    }

    @Override
    public RT visit(FieldAccess f, PT param) {
        f.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Cast f, PT param) {
        f.getExpression().accept(this, param);
        f.getType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(CharLiteral f, PT param) {
        return null;
    }

    @Override
    public RT visit(IntLiteral f, PT param) {
        return null;
    }

    @Override
    public RT visit(Comparison f, PT param) {
        f.getLeft().accept(this, param);
        f.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(UnaryMinus f, PT param) {
        f.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(UnaryNot f, PT param) {
        f.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(Logic f, PT param) {
        f.getLeft().accept(this, param);
        f.getRight().accept(this, param);
        return null;
    }

    @Override
    public RT visit(NumberLiteral f, PT param) {
        return null;
    }

    @Override
    public RT visit(Program p, PT param) {
        for(var definition : p.getDefinitions()){
            definition.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(Assignment p, PT param) {
        p.getExpression1().accept(this, param);
        p.getExpression2().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ConditionalStatement p, PT param) {
        for(var statement : p.getIfStatements()){
            statement.accept(this, param);
        }
        for(var statement : p.getElseStatements()){
            statement.accept(this, param);
        }
        p.getComparison().accept(this, param);
        return null;
    }

    @Override
    public RT visit(FunctionInvocation p, PT param) {
        for(var expression : p.getExpressionList()){
            expression.accept(this, param);
        }
        p.getVariable().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ReadStatement p, PT param) {
        p.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ReturnStatement p, PT param) {
        p.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(WhileStatement p, PT param) {
        for(var statement : p.getStatementList()){
            statement.accept(this, param);
        }
        p.getCondition().accept(this, param);
        return null;
    }

    @Override
    public RT visit(WriteStatement p, PT param) {
        p.getExpression().accept(this, param);
        return null;
    }

    @Override
    public RT visit(ArrayType p, PT param) {
        p.getType().accept(this, param);
        return null;
    }

    @Override
    public RT visit(CharType p, PT param) {
        return null;
    }

    @Override
    public RT visit(ErrorType p, PT param) {
        return null;
    }

    @Override
    public RT visit(FunctionType p, PT param) {
        p.getReturnType().accept(this, param);
        p.getVarDefinitionList().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public RT visit(IntType p, PT param) {
        return null;
    }

    @Override
    public RT visit(NumberType p, PT param) {
        return null;
    }

    @Override
    public RT visit(RecordType p, PT param) {
        for(var field : p.getRecordFieldList()){
            field.accept(this, param);
            field.getType().accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(VoidType p, PT param) {
        return null;
    }

    @Override
    public RT visit(RecordField p, PT param) {
        return null;
    }

    @Override
    public RT visit(FuncDefinition funcDefinition, PT param) {
        funcDefinition.getType().accept(this, param);
        funcDefinition.getVariablesList().forEach(variable -> variable.accept(this, param));
        funcDefinition.getStatementList().forEach(stmt -> stmt.accept(this, param));
        return null;
    }

    @Override
    public RT visit(VarDefinition varDefinition, PT param) {
        varDefinition.getType().accept(this, param);
        return null;
    }
}
