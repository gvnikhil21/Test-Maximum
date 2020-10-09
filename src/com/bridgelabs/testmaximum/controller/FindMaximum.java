package com.bridgelabs.testmaximum.controller;

public class FindMaximum {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Find Maximum");

		// find max Integer
		Integer xInt = 10;
		Integer yInt = 5;
		Integer zInt = 8;
		findMaxInteger(xInt, yInt, zInt);

		// find max Float
		Float xFloat = 10.5f;
		Float yFloat = 5.5f;
		Float zFloat = 8.5f;
		findMaxFloat(xFloat, yFloat, zFloat);
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

	public static Float findMaxFloat(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMaxFloat(max, x, y, z);
		return max;
	}

	private static void printMaxInteger(Integer max, Integer x, Integer y, Integer z) {
		System.out.println("Maximum Integer of " + x + ", " + y + ", " + z + " is : " + max);
	}

	private static void printMaxFloat(Float max, Float x, Float y, Float z) {
		System.out.println("Maximum Float of " + x + ", " + y + ", " + z + " is : " + max);
	}
}
