package com.bridgelabs.testmaximum.controller;

public class FindMaximum {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Find Maximum");

		// find max Integer
		Integer xInt = 10;
		Integer yInt = 5;
		Integer zInt = 8;
		findMax(xInt, yInt, zInt);

		// find max Float
		Float xFloat = 10.5f;
		Float yFloat = 5.5f;
		Float zFloat = 8.5f;
		findMax(xFloat, yFloat, zFloat);

		// find max String
		String xString = "Apple";
		String yString = "Peach";
		String zString = "Banana";
		findMax(xString, yString, zString);
	}

	public static <E extends Comparable<E>> E findMax(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMax(max, x, y, z);
		return max;
	}

	private static <E> void printMax(E max, E x, E y, E z) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is : " + max);
	}

}
