package ast.semantic;

import ast.Type;
import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.locatables.Expression;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

    private FuncDefinition currentFunction;

    @Override
    public Void visit(IntLiteral intl, Void param) {
        super.visit(intl, param);
        intl.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral charl, Void param) {
        super.visit(charl, param);
        charl.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(NumberLiteral numbl, Void param) {
        super.visit(numbl, param);
        numbl.setType(NumberType.getInstance());
        return null;
    }

    @Override
    public Void visit(Variable v, Void param){
        super.visit(v, param);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Logic l, Void param) {
        super.visit(l, param);
        l.setType(l.getLeft().getType().logic(l.getRight().getType(), l));
        return null;
    }

    @Override
    public Void visit(ConditionalStatement cons, Void param) {
        super.visit(cons, param);
        cons.getComparison().getType().mustBeLogical(cons);
        return null;
    }

    @Override
    public Void visit(WhileStatement ws, Void param) {
        super.visit(ws, param);
        ws.getCondition().getType().mustBeLogical(ws);
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        super.visit(a, param);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(), a));
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Void param) {
        super.visit(u, param);
        u.setType(u.getExpression().getType().arithmetic(u));
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        super.visit(a, param);
        if (!(a.getArray().getType() instanceof ArrayType)) {
            a.setType(new ErrorType("Cannot perform array access on non-array type", a));
            return null;
        }
        a.setType(a.getArray().getType().squareBrackets(a.getIndex().getType(), a));
        return null;
    }

    @Override
    public Void visit(Comparison c, Void param){
        super.visit(c, param);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(), c));
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Void param) {
        super.visit(u, param);
        u.setType(u.getExpression().getType().logic(u));
        return null;
    }

    @Override
    public Void visit(Assignment a, Void param) {
        super.visit(a, param);
        if (a.getExpression1().getType() instanceof ErrorType) {
            return null;
        }
        a.getExpression2()
                .getType()
                .mustPromoteTo(
                        a.getExpression1()
                                .getType()
                        , a);
        return null;
    }

    @Override
    public Void visit(ReadStatement r, Void param) {
        super.visit(r, param);
        r.getExpression().getType().mustBeBuiltIn(r);
        return null;
    }

    @Override
    public Void visit(WriteStatement r, Void param) {
        super.visit(r, param);
        if (r.getExpression().getType().getClass().equals(VoidType.class))
            new ErrorType("Type must be a built-in type", r);
        r.getExpression().getType().mustBeBuiltIn(r);
        return null;
    }

    @Override
    public Void visit(FuncDefinition f, Void param) {
        currentFunction = f;
        super.visit(f, param);
        f.getVariablesList().forEach(variable -> variable.getType().mustBeBuiltIn(variable));
        f.getType().mustBeBuiltIn(f);
        return null;
    }

    @Override
    public Void visit(Cast c, Void param) {
        super.visit(c, param);
        c.setType(c.getExpression().getType().canBeCastedTo(c.getType(), c));
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        super.visit(f, param);
        f.setType(f.getExpression().getType().dot(f.getField(), f));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Void param) {
        super.visit(f, param);
        if (!(f.getVariable().getType() instanceof FunctionType)) {
            f.setType(new ErrorType("Cannot invoke a non-function type", f));
            return null;
        }
        f.setType(f.getVariable().getType().parenthesis(f.getExpressionList().stream()
                .map(Expression::getType)
                .toList(), f));
        return null;
    }
    @Override
    public Void visit(ReturnStatement r, Void param) {
        FunctionType functionType = (FunctionType) currentFunction.getType();
        Type returnType = functionType.getReturnType();

        super.visit(r, param);

        if (r.getExpression() != null) {
            r.getExpression().getType().mustPromoteTo(returnType, r);
        } else if (!returnType.equals(VoidType.getInstance())) {
            new ErrorType("Cannot return void in a non-void function", r);
        }
        return null;
    }

}
