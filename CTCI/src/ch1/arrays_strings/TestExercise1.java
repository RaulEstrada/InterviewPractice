package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise1 {
	Exercise1 ex = new Exercise1();
	
	@Test
	void testOptimalRuntime() {
		assertTrue(ex.isUniqueOptimal("Raul"));
		assertFalse(ex.isUniqueOptimal("Hello"));
		assertTrue(ex.isUniqueOptimal("HeLlo"));
		assertTrue(ex.isUniqueOptimal(""));
		assertTrue(ex.isUniqueOptimal(null));
	}

	@Test
	void testNoAdditionalDataStructure() {
		assertTrue(ex.isUniqueNaive("Raul"));
		assertFalse(ex.isUniqueNaive("Hello"));
		assertTrue(ex.isUniqueNaive("HeLlo"));
		assertTrue(ex.isUniqueNaive(""));
		assertTrue(ex.isUniqueNaive(null));
	}

}
