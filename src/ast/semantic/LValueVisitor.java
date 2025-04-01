package ast.semantic;

import ast.ErrorHandler;
import ast.Program;
import ast.Visitor;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public class LValueVisitor extends AbstractVisitor<Void, Void> {

    @Override
    public Void visit(Variable v, Void param) {
        v.setLvalue(true);
       return super.visit(v, param);
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        a.setLvalue(false);
        return super.visit(a, param);
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        a.setLvalue(true);
        return super.visit(a, param);
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        f.setLvalue(true);
        return super.visit(f, param);
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.setLvalue(false);
        return super.visit(c, param);
    }

    @Override
    public Void visit(CharLiteral cl, Void param) {
        cl.setLvalue(false);
        return super.visit(cl, param);
    }

    @Override
    public Void visit(IntLiteral il, Void param) {
        il.setLvalue(false);
        return super.visit(il, param);
    }

    @Override
    public Void visit(Comparison c, Void param) {
        c.setLvalue(false);
        return super.visit( c, param );
    }

    @Override
    public Void visit(UnaryMinus u, Void param) {
        u.setLvalue(false);
        return super.visit(u, param);
    }

    @Override
    public Void visit(UnaryNot un, Void param) {
        un.setLvalue(false);
        return super.visit(un, param);
    }

    @Override
    public Void visit(Logic l, Void param) {
        l.setLvalue(false);
        return super.visit(l, param);
    }

    @Override
    public Void visit(NumberLiteral n, Void param) {
        n.setLvalue(false);
        return super.visit(n, param);
    }

    @Override
    public Void visit(Program p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(Assignment a, Void param) {
        super.visit( a, param );
        if(!a.getExpression1().getLvalue()){
            new ErrorType(
                            "Invalid value for the left hand " +
                                    "side of the assignment", a.getExpression1()
                    );
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStatement p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(FunctionInvocation p, Void param) {
        p.setLvalue(false);
        return super.visit( p, param );
    }

    // Comprobar lvalue de elementos
    @Override
    public Void visit(ReadStatement p, Void param) {
        super.visit( p, param );
        if(!p.getExpression().getLvalue()){
            new ErrorType(
                            "Invalid value for an " +
                                    "input statement", p.getExpression()
                    );
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatement p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(WhileStatement p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(WriteStatement p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(ArrayType p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(CharType p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(ErrorType p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(FunctionType p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(IntType p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(NumberType p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(RecordType p, Void param) {
        return super.visit( p, param );
    }

    @Override
    public Void visit(VoidType p, Void param) {
        return super.visit(p, param);
    }

    @Override
    public Void visit(RecordField p, Void param) {
        return super.visit(p, param);
    }
}
