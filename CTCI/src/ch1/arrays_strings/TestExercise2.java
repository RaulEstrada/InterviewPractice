package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise2 {
	private Exercise2 ex = new Exercise2();

	@Test
	void test() {
		assertFalse(ex.isPermutation("Sun", "Sunshine"));
		assertTrue(ex.isPermutation("Listen", "Silent"));
		assertFalse(ex.isPermutation("Apple", "Oranges"));
		assertFalse(ex.isPermutation("Sun", "Suns"));
		assertFalse(ex.isPermutation("Sin", "Sun"));
		assertTrue(ex.isPermutation("", ""));
		assertTrue(ex.isPermutation(null, null));
	}

}
