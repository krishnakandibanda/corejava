package com.array;

public class ArrayRotateRight {
	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println("\n------RightRotate--Array---");

		rightRotateArray(array);
	}

	public static void rightRotateArray(int[] arr) {
		int n = 3;
		// Rotate the given array by n times toward right
		for (int i = 0; i < n; i++) {
			int j, last;
			// Stores the last element of array
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) {
				// Shift element of array by one
				arr[j] = arr[j - 1];
			}
			// Last element of array will be added to the start of array.
			arr[0] = last;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
