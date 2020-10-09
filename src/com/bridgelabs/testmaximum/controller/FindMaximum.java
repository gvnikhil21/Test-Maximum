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
		printMax(max, x, y, z);
		return max;
	}

	private static <E> void printMax(E max, E x, E y, E z) {
		System.out.println("Maximum of " + x + ", " + y + ", " + z + " is : " + max);
	}

}
