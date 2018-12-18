package ch1.arrays_strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExercise3 {
	private Exercise3 ex = new Exercise3();

	@Test
	void test() {
		char[] input = new char[] {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
		char[] expct = new char[] {'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
		ex.URLify(input, 12);
		assertArrayEquals(input, expct);
	}

}
