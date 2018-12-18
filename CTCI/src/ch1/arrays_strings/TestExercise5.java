package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise5 {
	private Exercise5 ex = new Exercise5();
	
	@Test
	void test() {
		assertTrue(ex.isOneAway("pale", "ple"));
		assertTrue(ex.isOneAway("pales", "pale"));
		assertTrue(ex.isOneAway("pale", "bale"));
		assertFalse(ex.isOneAway("pale", "bake"));
		assertTrue(ex.isOneAway("palle", "plle"));
		assertTrue(ex.isOneAway("llles", "lles"));
	}

}
