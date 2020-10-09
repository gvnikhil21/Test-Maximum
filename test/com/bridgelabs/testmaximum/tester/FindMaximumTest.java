package com.bridgelabs.testmaximum.tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.bridgelabs.testmaximum.controller.FindMaximum;

public class FindMaximumTest {

	@Test
	public void givenMaxInteger_AtFirstPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMaxInteger(10, 5, 8);
		assertEquals(Integer.valueOf(10), Integer.valueOf(max));
	}

	@Test
	public void givenMaxInteger_AtSecondPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMaxInteger(5, 10, 8);
		assertEquals(Integer.valueOf(10), Integer.valueOf(max));
	}

	@Test
	public void givenMaxInteger_AtThirdPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMaxInteger(5, 8, 10);
		assertEquals(Integer.valueOf(10), Integer.valueOf(max));
	}
}
