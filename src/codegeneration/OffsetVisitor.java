package codegeneration;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.locatables.Definition;
import ast.locatables.Statement;
import ast.semantic.AbstractVisitor;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;

import java.util.List;


public class OffsetVisitor extends AbstractVisitor<Void, Void> {

    private int globalBytesSum = 0;
    private int localBytesSum = 0;

    @Override
    public Void visit(RecordType rt, Void param) {
        super.visit(rt, param);
        int fieldsBytesSum = 0;
        for(RecordField rf : rt.getRecordFieldList()) {
            rf.setOffset(fieldsBytesSum);
            fieldsBytesSum += rf.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(VarDefinition vd, Void param) {
        super.visit(vd, param);
        if(vd.getScope() == 0) {
            vd.setOffset(globalBytesSum);
            globalBytesSum += vd.getType().numberOfBytes();
        } else {
            localBytesSum += vd.getType().numberOfBytes();
            vd.setOffset(-localBytesSum);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType ft, Void param) {
        int paramBytesSum = 4;
        List<Definition> params = ft.getVarDefinitionList();

        for(int i = params.size() - 1; i >= 0; i--) {
            VarDefinition varDef = (VarDefinition) params.get(i);
            varDef.setOffset(paramBytesSum);
            paramBytesSum += varDef.getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(FuncDefinition fd, Void p) {
        localBytesSum = 0;
        fd.getType().accept(this, p);
        for (Definition v : fd.getVariablesList()) {
            v.accept(this, p);
        }
        for (Statement s : fd.getStatementList()) {
            s.accept(this, p);
        }
        return null;
    }
}
