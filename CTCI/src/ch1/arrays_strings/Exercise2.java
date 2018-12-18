package ch1.arrays_strings;

import java.util.Map;
import java.util.HashMap;

public class Exercise2 {
	
	/**
	 * Given two strings, checks if one is a permutation of the other.
	 * @param a - First string
	 * @param b - Second string
	 * @return - True if one is a permutation of the other. False otherwise.
	 */
	public boolean isPermutation(String a, String b) {
		if (a == null && b == null) {
			return true;
		}
		if (a.length() != b.length()) {
			return false;
		}
		Map<Character, Integer> count = createCount(a);
		for (char character : b.toCharArray()) {
			char lowerCharacter = Character.toLowerCase(character);
			int previous = count.getOrDefault(lowerCharacter, 0);
			if (previous == 0) {
				return false;
			}
			count.put(lowerCharacter, previous-1);
		}
		for (int countValue : count.values()) {
			if (countValue != 0) {
				return false;
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
			char lowerCharacter = Character.toLowerCase(character);
			int previous = count.getOrDefault(lowerCharacter, 0);
			count.put(lowerCharacter, previous+1);
		}
		return count;
	}
}
