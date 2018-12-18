package ch1.arrays_strings;

public class Exercise5 {
	/**
	 * There are 3 types of edits that can be performed on strings: insert a char,
	 * remove a char, or replace a char. Given two strings, this function checks if 
	 * they are one or zero edits away.
	 * Runtime: O(n)
	 * Memory: O(1)
	 * @param a - First input string
	 * @param b - Second input string
	 * @return - True if they are 1 or 0 edits away. False otherwise.
	 */
	public boolean isOneAway(String a, String b) {
		if (a == null || b == null) {
			return false;
		}
		int distance = 0, indexA = 0, indexB = 0;
		while (indexA < a.length() && indexB < b.length()) {
			if (a.charAt(indexA) == b.charAt(indexB)) {
				indexA++; indexB++;
			} else if (a.charAt(indexA) == b.charAt(indexB + 1)) {
				distance++; indexB++;
			} else if (b.charAt(indexB) == a.charAt(indexA + 1)) {
				distance++; indexA++;
			} else {
				distance++; indexA++; indexB++;
			}
		}
		return distance <= 1;
	}
}
