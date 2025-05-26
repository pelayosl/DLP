package ast.types;

import ast.ErrorHandler;
import ast.Locatable;
import ast.Type;
import ast.Visitor;
import ast.definitions.VarDefinition;

import java.util.*;

public class RecordType extends AbstractType{

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
                new ErrorType(recordField.getName() + " is already defined in this scope", recordField);
            }
        }
    }

    public List<RecordField> getRecordFieldList() {
        return recordFieldList;
    }

    public void setRecordFieldList(List<RecordField> recordFieldList) {
        this.recordFieldList = recordFieldList;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

    @Override
    public Type dot (String fieldName, Locatable l){
        for (RecordField field : recordFieldList) {
            if (field.getName().equals(fieldName)) {
                return field.getType();
            }
        }
        return super.dot(fieldName, l);
    }

    @Override
    public int numberOfBytes() {
        return this.recordFieldList
                .stream()
                .mapToInt(
                        rf -> rf.getType()
                                           .numberOfBytes()
                )
                .sum();
    }

    public RecordField getField(String fieldName) {
        return recordFieldList.stream()
                              .filter(rf -> rf.getName()
                                                         .equals(fieldName))
                              .findFirst()
                              .orElse(null);
    }

    @Override
    public String toString() {
        String aux = "RecordType[fields:[";
        RecordField rf = null;
        for(int i = 0; i < recordFieldList.size()-1; i++) {
            rf = recordFieldList.get(i);
            aux += "Field[";
            aux += "name:" + rf.getName() + ",";
            aux += "type:" + rf.getType() + " ";
            aux += "offset:" + rf.getOffset() + "], ";
        }
        rf = recordFieldList.getLast();
        aux += "Field[";
        aux += "name:" + rf.getName() + ",";
        aux += "type:" + rf.getType() + " ";
        aux += "offset:" + rf.getOffset() + "]";
        aux += "]]";
        return aux;
    }

}
