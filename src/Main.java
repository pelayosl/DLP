
import ast.ErrorHandler;
import ast.semantic.IdentificationVisitor;
import ast.semantic.LValueVisitor;
import ast.semantic.TypeCheckingVisitor;
import codegeneration.CodeGenerator;
import codegeneration.ExecuteCGVisitor;
import codegeneration.OffsetVisitor;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import org.antlr.v4.runtime.*;

import ast.ASTNode;
import parser.*;

public class Main {

    public static void main(String... args) throws Exception {
//        if (args.length < 2) {
//            System.err.println("Please, specify the input and output files.");
//            return;
//        }

        // create a lexer that feeds off of input CharStream
        CharStream input = CharStreams.fromFileName(args[0]);
        TSmmLexer lexer = new TSmmLexer(input);

        // create a parser that feeds off the tokens buffer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TSmmParser parser = new TSmmParser(tokens);
        ASTNode ast = parser.program().ast;

        ast.accept(new LValueVisitor(), null);
        ast.accept(new IdentificationVisitor(), null);
        ast.accept(new TypeCheckingVisitor(), null);
        // * Check errors
        if (ErrorHandler.getInstance().anyError()) {
            // * Show errors
            ErrorHandler.getInstance().showErrors(System.err);
        } else {
            // * The AST is shown
            ast.accept(new OffsetVisitor(), null);
//            ast.accept(new ExecuteCGVisitor(new CodeGenerator(args[1], args[0])), null);
            IntrospectorModel model = new IntrospectorModel("Program", ast);
            new IntrospectorView("Introspector", model);
        }
    }
}
