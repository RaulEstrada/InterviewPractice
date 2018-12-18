package ch1.arrays_strings;

public class Exercise3 {

	/**
	 * Replaces all spaces in a string with '%20', assuming the input String is an array of 
	 * characters with sufficient space at the end.
	 * Runtime: O(n)
	 * Memory: O(1) In place modification
	 * @param input - original input char array
	 * @param length - length of the real String
	 */
	public void URLify(char[] input, int length) {
		int headPointer = input.length - 1;
		for (int indx = length; indx >=0; indx--) {
			if (input[indx] != ' ') {
				input[headPointer--] = input[indx];
			} else {
				input[headPointer--] = '0';
				input[headPointer--] = '2';
				input[headPointer--] = '%';
			}
		}
	}
}
