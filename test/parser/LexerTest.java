package parser;

import org.antlr.v4.runtime.*;

public class LexerTest {

    public static void main(String... args) throws Exception {
        // creates a lexer that feeds off of input CharStream
        CharStream input = CharStreams.fromFileName("input.txt");
        // creates a buffer of tokens pulled from the lexer
        TSmmLexer lexer = new TSmmLexer(input);
        // tests the lexer for the given input file
        Token token;
        int i = 0;
        while ((token = lexer.nextToken()).getType() != TSmmLexer.EOF) {
            // We get the semantic value of the token
            Object semanticValue = null;
            System.out.println(token.getText());
            switch (token.getType()) {
                case TSmmLexer.INT_LITERAL:
                    semanticValue = LexerHelper.lexemeToInt(token.getText());
                    break;
                case TSmmLexer.CHAR_LITERAL:
                    semanticValue = LexerHelper.lexemeToChar(token.getText());
                    break;
                case TSmmLexer.NUMBER_LITERAL:
                    semanticValue = LexerHelper.lexemeToReal(token.getText());
                    break;
                default:
                    semanticValue = token.getText();
            }
            // We test the token
            if (i >= expectedTokens.length) {
                System.err.println("Found more tokens than expected in the array 'expectedTokens'.");
                return;
            }
            expectedTokens[i].assertEquals(token.getLine(), token.getCharPositionInLine() + 1, token.getText(), token.getType(), semanticValue);
            i++;
        }
    }

    private static LexicalInfo[] expectedTokens = new LexicalInfo[]{
            new LexicalInfo(6, 5, "0", TSmmLexer.INT_LITERAL, 0),
            new LexicalInfo(6, 7, "123", TSmmLexer.INT_LITERAL, 123),
            new LexicalInfo(7, 5, "0", TSmmLexer.INT_LITERAL, 0),
            new LexicalInfo(7, 6, "120", TSmmLexer.INT_LITERAL, 120),

			new LexicalInfo(11, 5, "12.3", TSmmLexer.NUMBER_LITERAL, 12.3),
			new LexicalInfo(11, 11, "2.", TSmmLexer.NUMBER_LITERAL, 2.0),
			new LexicalInfo(11, 15, ".34", TSmmLexer.NUMBER_LITERAL, 0.34),
			new LexicalInfo(12, 5, "34.12E-3", TSmmLexer.NUMBER_LITERAL, 0.03412),
			new LexicalInfo(12, 15, "3e3", TSmmLexer.NUMBER_LITERAL, 3000.0),
			new LexicalInfo(12, 20, "0.0003", TSmmLexer.NUMBER_LITERAL, .0003),


			new LexicalInfo(16, 5, "var1", TSmmLexer.ID, "var1"),
			new LexicalInfo(16, 11, "_var_1", TSmmLexer.ID, "_var_1"),
			new LexicalInfo(16, 19, "VAR_1_AB_2", TSmmLexer.ID, "VAR_1_AB_2"),

			new LexicalInfo(20, 5, "'a'", TSmmLexer.CHAR_LITERAL, 'a'),
			new LexicalInfo(20, 10, "'b'", TSmmLexer.CHAR_LITERAL, 'b'),
			new LexicalInfo(20, 15, "'.'", TSmmLexer.CHAR_LITERAL, '.'),
			new LexicalInfo(20, 20, "'-'", TSmmLexer.CHAR_LITERAL, '-'),
			new LexicalInfo(20, 25, "'~'", TSmmLexer.CHAR_LITERAL, '~'),
			new LexicalInfo(21, 5, "'\\n'", TSmmLexer.CHAR_LITERAL, '\n'),
			new LexicalInfo(21, 11, "'\\t'", TSmmLexer.CHAR_LITERAL, '\t'),
			new LexicalInfo(22, 5, "'\\126'", TSmmLexer.CHAR_LITERAL, '~'),
    };
}
