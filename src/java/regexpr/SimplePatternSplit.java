package regexpr;

import java.util.regex.Pattern;

public class SimplePatternSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s");
		
		String[] split = pattern.split("Arun 1 Johny");
		for (String string : split) {
			System.out.println(string);
		}
	}

}
