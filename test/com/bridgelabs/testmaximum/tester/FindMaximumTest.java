package com.bridgelabs.testmaximum.tester;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.bridgelabs.testmaximum.controller.FindMaximum;

public class FindMaximumTest {

	@Test
	public void givenGenericMax_AtFirstPosition_ShouldReturnSameGeneric() {
		assertEquals(Integer.valueOf(10), new FindMaximum<Integer>(10, 5, 8).findMaximum());
		assertEquals(Float.valueOf(10.5f), new FindMaximum<Float>(10.5f, 5.5f, 8.5f).findMaximum());
		assertEquals("Peach", new FindMaximum<String>("Peach", "Apple", "Banana").findMaximum());
	}

	@Test
	public void givenGenericMax_AtSecondtPosition_ShouldReturnSameGeneric() {
		assertEquals(Integer.valueOf(10), new FindMaximum<Integer>(5, 10, 8).findMaximum());
		assertEquals(Float.valueOf(10.5f), new FindMaximum<Float>(5.5f, 10.5f, 8.5f).findMaximum());
		assertEquals("Peach", new FindMaximum<String>("Apple", "Peach", "Banana").findMaximum());
	}

	@Test
	public void givenGenericMax_AtThirdPosition_ShouldReturnSameGeneric() {
		assertEquals(Integer.valueOf(10), new FindMaximum<Integer>(8, 5, 10).findMaximum());
		assertEquals(Float.valueOf(10.5f), new FindMaximum<Float>(8.5f, 5.5f, 10.5f).findMaximum());
		assertEquals("Peach", new FindMaximum<String>("Banana", "Apple", "Peach").findMaximum());
	}
}
