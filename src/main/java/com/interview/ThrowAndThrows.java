package com.interview;

public class ThrowAndThrows {

	public int reminderTest(int number1, int number2) throws ArithmeticException, Exception {
		return number1 / number2;
	}

	public static void main(String[] args) {
		ThrowAndThrows main = new ThrowAndThrows();
		try {
			System.out.println(main.reminderTest(40, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
