package io.javabrain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils math = new MathUtils();
		int expected = 3;
		int actual = math.add(1, 1);
		assertEquals(expected, actual);
	}

}
