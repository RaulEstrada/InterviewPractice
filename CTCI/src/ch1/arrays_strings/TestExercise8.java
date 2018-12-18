package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise8 {
	private Exercise8 ex = new Exercise8();

	@Test
	void test() {
		int[][] input1 = new int[][] {{3,2,1,4}, {1,12,7,6}};
		int[][] expected1 = new int[][] {{3,2,1,4}, {1,12,7,6}};
		ex.toZeroMatrix(input1);
		assertArrayEquals(input1, expected1);
		
		int[][] input2 = new int[][] {{3,2,0,3}, {1,12,7,6}};
		int[][] expected2 = new int[][] {{0,0,0,0}, {1,12,0,6}};
		ex.toZeroMatrix(input2);
		assertArrayEquals(input2, expected2);
		
		int[][] input3 = new int[][] {{0,2,0,3}, {1,12,7,6}};
		int[][] expected3 = new int[][] {{0,0,0,0}, {0,12,0,6}};
		ex.toZeroMatrix(input3);
		assertArrayEquals(input3, expected3);
		
		int[][] input4 = new int[][] {{7,6,5,4}, {3,0,0,2}, {2,7,6,4}, {1,12,13,14}};
		int[][] expected4 = new int[][] {{7,0,0,4}, {0,0,0,0}, {2,0,0,4}, {1,0,0,14}};
		ex.toZeroMatrix(input4);
		assertArrayEquals(input4, expected4);
	}

}
