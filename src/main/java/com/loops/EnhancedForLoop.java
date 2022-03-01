package com.loops;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[] arrayofNumbers = { 1, 2, 3, 5, 4, 6, 7, 8, 9, 10 };

		for (int i = 2; i < arrayofNumbers.length; i++) {
			System.out.println("------" + i);
		}

		String[] arrayofString = { "Krishna", "Pandu", "Run", "Setup" };

		for (int i = 0; i < arrayofString.length; i++) {
			System.out.println("-Strings---" + arrayofString[i]);
		}

		for (int i : arrayofNumbers) {
			System.out.println("Count of " + i + " is == " + i);

		}
		System.out.println("Array of length =  " + arrayofNumbers.length);

		for (String str : arrayofString) {
			System.out.println(" print string name one by one  = " + str);
			System.out.println("....." + arrayofString.length);
		}
	}
}
