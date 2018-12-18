package ch1.arrays_strings;

public class Exercise8 {
	/**
	 * If an element in a MxN matrix is 0, its entire row and column are set to 0.
	 * Runtime: O(MxN)
	 * Memory: O(1) In-place
	 * @param original - Original MxN matrix
	 */
	public void toZeroMatrix(int[][] original) {
		// Check for zeros in the first row
		boolean zeroRow = false;
		for (int i = 0; i < original[0].length; i++) {
			if (original[0][i] == 0) {
				zeroRow = true;
			}
		}
		// Check for zeros in the first column
		boolean zeroColumn = false;
		for (int i = 0; i < original.length; i++) {
			if (original[i][0] == 0) {
				zeroColumn = true;
			}
		}
		// CHeck for zeros in rest of matrix. If so, mark that row and column.
		for (int i = 1; i < original.length; i++) {
			for (int j = 1; j < original[i].length; j++) {
				if (original[i][j] == 0) {
					original[i][0] = 0;
					original[0][j] = 0;
				}
			}
		}
		// Traverse matrix. If row or column marked, then set element to 0
		for (int i = 1; i < original.length; i++) {
			for (int j = 1; j < original[i].length; j++) {
				if (original[0][j] == 0 || original[i][0] == 0) {
					original[i][j] = 0;
				}
			}
		}
		// If first row contained 0 initially, set all elements to 0
		if (zeroRow) {
			for (int i = 0; i < original[0].length; i++) {
				original[0][i] = 0;
			}
		}
		// If first column contained 0 initially, set all elements to 0.
		if (zeroColumn) {
			for (int i = 0; i < original.length; i++) {
				original[i][0] = 0;
			}
		}
	}
}
