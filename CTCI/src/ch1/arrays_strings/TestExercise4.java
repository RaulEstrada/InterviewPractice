package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise4 {
	private Exercise4 ex = new Exercise4();

	@Test
	void test() {
		assertTrue(ex.isPalindromePermutation("Tact Coa"));
		assertTrue(ex.isPalindromePermutation(""));
		assertTrue(ex.isPalindromePermutation(null));
		assertFalse(ex.isPalindromePermutation("Act Coa"));
	}

}
