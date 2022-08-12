package com.array;

public class ArrayLastDigitsSameValue {

	public static void main(String[] args) {
		int a[] = new int[] { 101, 108, 218, 338, 150, 198 };
		lastDigitAnyNum(a);
		// firstDigitSame(a);
		printFirstDigit(a, 3);
		firstAndLastDigits();
	}

	public static void firstAndLastDigits() {
		int number = 502356997;
		int firstDigit = 0;
		int lastDigit = 0;

		lastDigit = number % 10;
		// (%) Remainder
		System.out.println("Last digit: " + lastDigit);

		while (number != 0) {
			firstDigit = number % 10;
			number /= 10;
			// (/)coefficient
		}
		System.out.println("First digit: " + firstDigit);
	}

	public static void printFirstDigit(int input[], int number) {
		for (int i = 0; i < input.length; i++) {
			int element = input[i];
			while (element >= 10) {
				element = element / 10;
			}
			if (number == element) {
				System.out.println(input[i]);
			}
		}
	}

	public static void lastDigitAnyNum(int x[]) {
		int lastD[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 10 == 8) {
				lastD[i] = x[i];
			}
		}
		for (int i = 0; i < lastD.length; i++) {
			if (lastD[i] != 0)
				System.out.print(lastD[i] + ",");
		}
	}

	public static int firstDi(int number) {
		int result = 0;
		int n = 10;
		while (number >= n) {
			number = number / 10;
			result = number;
		}
		return result;
	}
}
