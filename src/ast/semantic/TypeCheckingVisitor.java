package ast.semantic;

import ast.Type;
import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.locatables.Expression;
import ast.statements.*;
import ast.types.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class TypeCheckingVisitor extends AbstractVisitor<Void, Type> {

    @Override
    public Void visit(IntLiteral intl, Type param) {
        super.visit(intl, param);
        intl.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral charl, Type param) {
        super.visit(charl, param);
        charl.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(NumberLiteral numbl, Type param) {
        super.visit(numbl, param);
        numbl.setType(NumberType.getInstance());
        return null;
    }

    @Override
    public Void visit(Variable v, Type param){
        super.visit(v, param);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Logic l, Type param) {
        super.visit(l, param);
        l.setType(l.getLeft().getType().logic(l.getRight().getType(), l));
        return null;
    }

    @Override
    public Void visit(ConditionalStatement cons, Type param) {
        super.visit(cons, param);
        cons.getComparison().getType().mustBeLogical(cons);
        return null;
    }

    @Override
    public Void visit(WhileStatement ws, Type param) {
        super.visit(ws, param);
        ws.getCondition().getType().mustBeLogical(ws);
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Type param) {
        super.visit(a, param);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(), a));
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Type param) {
        super.visit(u, param);
        u.setType(u.getExpression().getType().arithmetic(u));
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Type param) {
        super.visit(a, param);
        if (!(a.getArray().getType() instanceof ArrayType)) {
            a.setType(new ErrorType("Cannot perform array access on non-array type", a));
            return null;
        }
        a.setType(a.getArray().getType().squareBrackets(a.getIndex().getType(), a));
        return null;
    }

    @Override
    public Void visit(Comparison c, Type param){
        super.visit(c, param);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(), c));
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Type param) {
        super.visit(u, param);
        u.setType(u.getExpression().getType().logic(u));
        return null;
    }

    @Override
    public Void visit(Assignment a, Type param) {
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
    public Void visit(ReadStatement r, Type param) {
        super.visit(r, param);
        r.getExpression().getType().mustBeBuiltIn(r);
        return null;
    }

    @Override
    public Void visit(WriteStatement r, Type param) {
        super.visit(r, param);
        r.getExpression().getType().mustBeBuiltIn(r);
        return null;
    }

    @Override
    public Void visit(FuncDefinition f, Type param) {
        FunctionType fType = (FunctionType) f.getType();
        super.visit(f, fType.getReturnType());
        f.getType().mustBeBuiltIn(f);
        return null;
    }


    @Override
    public Void visit(FieldAccess f, Type param) {
        super.visit(f, param);
        f.setType(f.getExpression().getType().dot(f.getField(), f));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Type param) {
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
    public Void visit(ReturnStatement r, Type returnType) {
        super.visit(r, returnType);
        r.getExpression().getType().mustPromoteTo(returnType, r);
        return null;
    }

    @Override
    public Void visit(Cast c, Type param) {
        super.visit(c, param);
        c.setType(c.getExpression().getType().canBeCastedTo(c.getType(), c));
        return null;
    }

}
