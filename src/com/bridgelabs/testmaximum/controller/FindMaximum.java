package com.bridgelabs.testmaximum.controller;

public class FindMaximum {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Find Maximum");

		Integer x = 10;
		Integer y = 5;
		Integer z = 8;

		findMaxInteger(x, y, z);
	}

	public static Integer findMaxInteger(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMaxInteger(max, x, y, z);
		return max;
	}

	private static void printMaxInteger(Integer max, Integer x, Integer y, Integer z) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is : " + max);
	}
}
