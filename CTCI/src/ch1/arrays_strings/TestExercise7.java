package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise7 {
	private Exercise7 ex = new Exercise7();

	@Test
	void test() {
		int[][] input1 = new int[][] {{1, 2}, {4, 3}};
		int[][] expected1 = new int[][] {{4, 1}, {3, 2}};
		ex.rotateMatrix(input1);
		assertArrayEquals(input1, expected1);
		int[][] input2 = new int[][] {{1,2,3},{6,5,4},{7,8,9}};
		int[][] expected2 = new int[][] {{7,6,1}, {8,5,2}, {9,4,3}};
		ex.rotateMatrix(input2);
		assertArrayEquals(input2, expected2);
		int[][] input3 = new int[][] {{1,2,3,4},{8,7,6,5},{9,10,11,12},{16,15,14,13}};
		int[][] expected3 = new int[][] {{16,9,8,1}, {15,10,7,2}, {14,11,6,3}, {13,12,5,4}};
		ex.rotateMatrix(input3);
		assertArrayEquals(input3, expected3);
	}

}
