import ast.ErrorHandler;
import ast.Visitor;
import ast.semantic.IdentificationVisitor;
import ast.semantic.LValueVisitor;
import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import ast.ASTNode;
import parser.TSmmLexer;
import parser.TSmmParser;

public class Main {

	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		TSmmLexer lexer = new TSmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		TSmmParser parser = new TSmmParser(tokens);
		ASTNode ast = parser.program().ast;

		Visitor lValueVisitor = new LValueVisitor();
		ast.accept(lValueVisitor, null);
		Visitor idVisitor = new IdentificationVisitor();
		ast.accept(idVisitor, null);

		// * Check errors
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
		}
	}
}
