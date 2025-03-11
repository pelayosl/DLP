package ast.types;

import ast.ErrorHandler;
import ast.Type;
import ast.definitions.VarDefinition;

import java.util.*;

public class RecordType implements Type {

    private List<RecordField> recordFieldList;

    public RecordType(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;

        Map<String, Integer> nameCount = new HashMap<>();
        List<String> uniqueFields = new ArrayList<>();

        for (RecordField recordField : recordFieldList) {
            nameCount.put(recordField.getName(), nameCount.getOrDefault(recordField.getName(), 0) + 1);
        }

        for (RecordField recordField : recordFieldList) {
            if(!uniqueFields.contains(recordField.getName())) {
                uniqueFields.add(recordField.getName());
            }
            else if (nameCount.get(recordField.getName()) > 1) {
                ErrorHandler
                        .getInstance()
                        .addError(new ErrorType(recordField.getName() + " is already defined in this scope", recordField));
            }
        }
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    public void setRecordFieldList(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }
}
