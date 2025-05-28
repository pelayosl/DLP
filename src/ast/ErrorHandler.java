package ast;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ErrorHandler {
    private static final ErrorHandler INSTANCE = new ErrorHandler();
    private final List<ErrorType> errorTypeList = new ArrayList<ErrorType>();

    private ErrorHandler() {}

    public static ErrorHandler getInstance() {
        return INSTANCE;
    }

    public void addError(ErrorType errorType) {
        errorTypeList.add(errorType);
    }

    public void showErrors(PrintStream stream){
        errorTypeList.sort(Comparator.comparingInt(err -> err.getLocation().getLine()));
        errorTypeList.forEach(errorType -> stream.println(errorType.toString()));
    }

    public boolean anyError(){
        return !errorTypeList.isEmpty();
    }

}
