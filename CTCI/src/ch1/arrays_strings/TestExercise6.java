package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise6 {
	private Exercise6 ex = new Exercise6();

	@Test
	void test() {
		assertEquals(ex.compress("aabcccccaaa"), "a2b1c5a3");
		assertEquals(ex.compress("AabccCCCaaAAAAA"), "A1a1b1c2C3a2A5");
		assertEquals(ex.compress("AabccCCCaaA"), "AabccCCCaaA");
		assertEquals(ex.compress(""), "");
		assertNull(ex.compress(null));
	}

}
