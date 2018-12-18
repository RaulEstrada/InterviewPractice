package ch1.arrays_strings;

public class Exercise7 {
	
	/**
	 * Given an image represented by an NxN matrix, where each pixel is an integer,
	 * this method rotates the image by 90 degrees in place.
	 * Runtime: O(n^2)
	 * Memory: O(1)
	 * @param original
	 */
	public void rotateMatrix(int[][] original) {
		for (int i = 0; i < original.length/2.0; i++) {
			for (int j = i; j < original[i].length-1-i; j++) {
				int tmp = original[i][j];
				original[i][j] = original[original.length - 1 - j][i];
				original[original.length - 1 - j][i] = original[original.length - 1 - i][original.length - 1 - j];
				original[original.length - 1 - i][original.length - 1 - j] = original[j][original.length - 1 - i];
				original[j][original.length - 1 - i] = tmp;
			}
		}
	}
}
