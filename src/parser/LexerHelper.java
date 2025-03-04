package parser;

public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str) {
		try{
			return Double.parseDouble(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	// It needs to transform '\97' to 'a', for example
	public static char lexemeToChar(String str) {
		str = str.substring(1, str.length() - 1);

		if (str.equals("\\n"))
			return '\n';

		if (str.equals("\\t"))
			return '\t';

		if (str.startsWith("\\") && str.length() > 1) {
			try {
                return (char) Integer.parseInt(str.substring(1));
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("Invalid ASCII code format: " + str);
			}
		}
		if (str.length() == 1) {
			return str.charAt(0);
		}
		throw new IllegalArgumentException("Invalid character literal format: " + str);
	}
}
