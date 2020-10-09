package com.bridgelabs.testmaximum.tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.bridgelabs.testmaximum.controller.FindMaximum;

public class FindMaximumTest {

	@Test
	public void givenMaxInteger_AtFirstPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMax(10, 5, 8);
		assertEquals(Integer.valueOf(10), max);
	}

	@Test
	public void givenMaxInteger_AtSecondPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMax(5, 10, 8);
		assertEquals(Integer.valueOf(10), max);
	}

	@Test
	public void givenMaxInteger_AtThirdPosition_ShouldReturnSameInteger() {
		Integer max = FindMaximum.findMax(5, 8, 10);
		assertEquals(Integer.valueOf(10), max);
	}

	@Test
	public void givenMaxFloat_AtFirstPosition_ShouldReturnSameFloat() {
		Float max = FindMaximum.findMax(10.5f, 5.5f, 8.5f);
		assertEquals(Float.valueOf(10.5f), max);
	}

	@Test
	public void givenMaxFloat_AtSecondPosition_ShouldReturnSameFloat() {
		Float max = FindMaximum.findMax(5.5f, 10.5f, 8.5f);
		assertEquals(Float.valueOf(10.5f), max);
	}

	@Test
	public void givenMaxFloat_AtThirdPosition_ShouldReturnSameFloat() {
		Float max = FindMaximum.findMax(8.5f, 5.5f, 10.5f);
		assertEquals(Float.valueOf(10.5f), max);
	}

	@Test
	public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
		String max = FindMaximum.findMax("Peach", "Apple", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
		String max = FindMaximum.findMax("Apple", "Peach", "Banana");
		assertEquals("Peach", max);
	}

	@Test
	public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
		String max = FindMaximum.findMax("Apple", "Banana", "Peach");
		assertEquals("Peach", max);
	}
}
