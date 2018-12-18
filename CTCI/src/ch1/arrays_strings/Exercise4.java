package ch1.arrays_strings;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	/**
	 * Given a string, checks if it is a permutation of a palindrome. The palindrome does not 
	 * need to be limited to just dictionary words.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param in - Input string
	 * @return - True if string is a permutation of a palindrome. False otherwise.
	 */
	public boolean isPalindromePermutation(String in) {
		if (in == null) {
			return true;
		}
		Map<Character, Integer> count = createCount(in);
		boolean oddUsed = false;
		for (int value : count.values()) {
			if (value % 2 != 0 && oddUsed) {
				return false;
			} else if (value % 2 != 0) {
				oddUsed = true;
			}
		}
		return true;
	}
	
	/**
	 * Creates a dictionary where each char in the String is the key, and the value 
	 * is the number of times that character appears in the string
	 * @param input - Input string
	 * @return - Count map
	 */
	private Map<Character, Integer> createCount(String input) {
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for (char character : input.toCharArray()) {
			if (character != ' ') {
				char lowerCharacter = Character.toLowerCase(character);
				int previous = count.getOrDefault(lowerCharacter, 0);
				count.put(lowerCharacter, previous+1);
			}
		}
		return count;
	}
}
