package com.array;

public class MaxElementInArray {

	public static void maxElement(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max  " + max);
	}

	public static void main(String[] args) {
		int[] array = new int[] { 5, 8, 7, 6, 1, 10 };
		maxElement(array);
		System.out.println("Array  Length  == " + array.length);

		System.out.println("--------------------For----------");
		for (int i = 0; i < array.length; i++) {
			System.out.print("," + array[i]);
		}
		System.out.println("\n------------------For-Each------");
		for (int i : array) {
			System.out.print("," + i);
		}
		System.out.println("\n------------------------While---");
		int j = 0;
		while (j < array.length) {
			System.out.print("," + array[j]);
			j++;
		}
		System.out.println("\n-------------------Do-While-----");
		if (array.length > 0) {
			int k = 0;
			do {
				System.out.print("," + array[k]);
				k++;
			} while (k < array.length);
		}

	}
}
