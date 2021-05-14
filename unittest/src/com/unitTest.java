package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class unitTest {
	
	
@Test
public void test() {
	unit u = new unit();
	int expected = 2;
	int actual = u.add(1, 1);
	assertEquals(expected, actual);
}
}
