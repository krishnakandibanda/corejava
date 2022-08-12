package com.array;

public class TestLogic {

	public static void main(String[] args) {
		int a[] = new int[] { 10, 18, 10, 18, 3, 18 };

		for (int b : a) {
			System.out.print(b + ",");
		}
		System.out.println("\n After----");

		lastDigits(a);
	}

	public static void lastDigits(int[] a) {

		int[] lastdigit = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 8) {
				lastdigit[i] = a[i];
			}
		}
		for (int i = 0; i < lastdigit.length; i++) {
			if (lastdigit[i] != 0) {
				System.out.println("---Last Digit 8 ---" + lastdigit[i]);
			}
		}
	}

}
