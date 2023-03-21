package morsecodetranslator;

import java.util.HashMap;

public class MorseTranslator {

	// maybe uses key pair values for a letter and the morse representation????

	HashMap<String, String> morse = new HashMap<String, String>();
	// created hashmap
	{
		morse.put(".-", "a");
		morse.put("-...", "b");
		morse.put("-.-.", "c");
		morse.put("-..", "d");
		morse.put(".", "e");
		morse.put("..-.", "f");
		morse.put("--.", "g");
		morse.put("....", "h");
		morse.put("..", "i");
		morse.put(".---", "j");
		morse.put("-.-", "k");
		morse.put(".-..", "l");
		morse.put("--", "m");
		morse.put("-.", "n");
		morse.put("---", "o");
		morse.put(".--.", "p");
		morse.put("--.-", "q");
		morse.put(".-.", "r");
		morse.put("...", "s");
		morse.put("-", "t");
		morse.put("..-", "u");
		morse.put("...-", "v");
		morse.put(".--", "w");
		morse.put("-..-", "x");
		morse.put("-.--", "y");
		morse.put("--..", "z");
		// morse.put(" ", "");
		// morse.put("/", " ");

	}

	// public String translate(String userInput) {
	// String translated = "";
	// for (char c : userInput.toCharArray()) {
	// String s = String.valueOf(c);
	// translated += morse.get(s);
	// }
	// iterate through word list for length of word
	// return translated;
	// }

	public String translate(String userInput) {
		String translated = "";

	}

}
