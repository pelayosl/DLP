package codegeneration;

import ast.expressions.*;
import ast.statements.FunctionInvocation;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    public final CodeGenerator codeGenerator;
    public AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    @Override
    public Void visit(Variable v, Void param) {
        v.accept(addressCGVisitor, param);
        codeGenerator.load(v.getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        codeGenerator.push(i.getValue());
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        codeGenerator.push(c.getValue());
        return null;
    }

    @Override
    public Void visit(NumberLiteral n, Void param) {
        codeGenerator.push(n.getValue());
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        a.getLeft().accept(this, param);
        codeGenerator.convertTo(a.getLeft().getType(), a.getType());
        a.getRight().accept(this, param);
        codeGenerator.convertTo(a.getRight().getType(), a.getType());
        codeGenerator.arithmetic(a.getOperator(), a.getType());
        return null;
    }

    @Override
    public Void visit(Comparison c, Void param) {
        c.getLeft().accept(this, param);
        c.getRight().accept(this, param);
        codeGenerator.convertTo(c.getLeft().getType(), c.getType());
        codeGenerator.convertTo(c.getRight().getType(), c.getType());
        codeGenerator.comparison(c.getOperator(), c.getType());
        return null;
    }

    @Override
    public Void visit(Logic l, Void param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        codeGenerator.logic(l.getOperator());
        return null;
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.getExpression().accept(this, param);
        codeGenerator.convertTo(c.getExpression().getType(), c.getType());
        return null;
    }

    @Override
    public Void visit(UnaryNot un, Void param) {
        un.getExpression().accept(this, param);
        codeGenerator.not();
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.accept(addressCGVisitor, param);
        codeGenerator.load(a.getType());
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        f.accept(addressCGVisitor, param);
        codeGenerator.load(f.getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Void param) {
        f.getExpressionList().forEach(exp -> exp.accept(this, param));
        codeGenerator.call(f.getVariable().getName());
        return null;
    }

}
