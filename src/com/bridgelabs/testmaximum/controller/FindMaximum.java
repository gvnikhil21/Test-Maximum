package com.bridgelabs.testmaximum.controller;

public class FindMaximum<E extends Comparable<E>> {
	E x, y, z;

	public FindMaximum(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to Find Maximum");

		Integer xInt = 10, yInt = 5, zInt = 8;
		Float xFloat = 10.5f, yFloat = 5.5f, zFloat = 8.5f;
		String xString = "Apple", yString = "Peach", zString = "Banana";

		new FindMaximum<Integer>(xInt, yInt, zInt).findMaximum();
		new FindMaximum<Float>(xFloat, yFloat, zFloat).findMaximum();
		new FindMaximum<String>(xString, yString, zString).findMaximum();

		System.out.println("Printing max using variable args : ");
		findMax(10, 5, 0, 30, 25);
		findMax(10.5f, 5.5f, 0f, 30.5f, 25.5f);
		findMax("Apple", "Banana", "Mango", "Guava", "Orange");
	}

	public E findMaximum() {
		return findMax(x, y, z);
	}

	public static <E extends Comparable<E>> E findMax(E x, E y, E z) {
		E max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMax(max);
		return max;
	}

	public static <E extends Comparable<E>> E findMax(E... x) {
		E max = x[0];
		for (E y : x) {
			if (y.compareTo(max) > 0)
				max = y;
		}

		printMax(max);
		return max;
	}

	private static <E> void printMax(E max) {
		System.out.println("Maximum is : " + max);
	}
}
