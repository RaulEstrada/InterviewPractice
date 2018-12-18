package ch1.arrays_strings;

import java.util.Set;
import java.util.HashSet;

public class Exercise1 {
	
	/**
	 * Determines if a string has all unique characters. 
	 * Additional data structures used.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param input - input string
	 * @return - True if unique characters. False otherwise
	 */
	public boolean isUniqueOptimal(String input) {
		if (input == null) {
			return true;
		}
		Set<Character> chars = new HashSet<Character>();
		for (char character : input.toCharArray()) {
			if (chars.contains(character)) {
				return false;
			} else {
				chars.add(character);
			}
		}
		return true;
	}
	
	/**
	 * Determines if a string has all unique characters. 
	 * No additional data structures used.
	 * Runtime: O(n^2)
	 * Memory: O(1)
	 * @param input - input string
	 * @return - True if unique characters. False otherwise
	 */
	public boolean isUniqueNaive(String input) {
		if (input == null) {
			return true;
		}
		for (int i = 0; i < input.length() - 1; i++) {
			for (int j = i + 1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
