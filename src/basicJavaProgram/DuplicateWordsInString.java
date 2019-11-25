package basicJavaProgram;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {
	// Hey java is java is best language java
	// java=3
	// is=2

	public static void findDuplicateWords(String inputString) {
		// split
		String words[] = inputString.split(" ");
		// create one HashMap:
		HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

		// to check each words in given array:

		for (String word : words) {

			// if word is present
			if (wordsCount.containsKey(word)) {

				wordsCount.put(word.toLowerCase(), wordsCount.get(word) + 1);
			} else {
				wordsCount.put(word, 1);
			}
		}
		// extracting all the key of map:wordsCount

		Set<String> wordsInString = wordsCount.keySet();
		// loop through all the words in wordCount:
		for (String word : wordsInString) {

			if (wordsCount.get(word) > 1) {
				System.out.println(word + ":" + wordsCount.get(word));
			}
		}
	}

	public static void main(String[] args) {

		findDuplicateWords("Hey java where are you java are you mad java");
	}

}
