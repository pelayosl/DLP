package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.List;

public class RecordType implements Type {

    private List<RecordField> recordFieldList;

    public RecordType(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    public void setRecordFieldList(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }
}
