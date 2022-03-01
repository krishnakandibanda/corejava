package com.java8;

public class ArithmeticTest {

	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath operation) {
		return operation.operation(a, b);
	}

	public static void main(String... args) {
		ArithmeticTest myApp = new ArithmeticTest();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		IntegerMath mul = (a, b) -> a * b;

		System.out.println("40 + 10 = " + myApp.operateBinary(40, 10, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
		System.out.println("4 * 5 = " + myApp.operateBinary(4, 5, mul));

	}
}
