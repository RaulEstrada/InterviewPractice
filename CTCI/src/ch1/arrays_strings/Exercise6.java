package ch1.arrays_strings;

public class Exercise6 {
	/**
	 * Performs basic string compression using the counts of repeated characters. If the 
	 * compressed string does not become smaller than the original string, then returns
	 * original string.
	 * Runtime: O(n)
	 * Memory: O(n)
	 * @param original - String to compress
	 * @return - Compressed string, or original if compressed form is not smaller than original.
	 */
	public String compress(String original) {
		if (original == null || original.isEmpty()) {
			return original;
		}
		StringBuilder sb = new StringBuilder();
		char current = original.charAt(0);
		int count = 1;
		for (int i = 1; i < original.length(); i++) {
			if (original.charAt(i) == current) {
				count++;
			} else {
				sb.append(current + "" + count);
				current = original.charAt(i);
				count = 1;
			}
		}
		sb.append(current + "" + count);
		String compressed = sb.toString();
		if (compressed.length() < original.length()) {
			return compressed;
		}
		return original;
	}
}
