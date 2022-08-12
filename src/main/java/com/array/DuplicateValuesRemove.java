package com.array;

public class DuplicateValuesRemove {

	public static void main(String[] args) {

		int array[] = new int[] { 12, 14, 12 };

		System.out.println("----Before -- Array ----");
		for (int b : array) {
			System.out.print(b + ",");
		}
		System.out.println("\n----After remove duplicate -- Array---");
		// removeDuplicate(array);
		anotherWay(array);
	}

	public static void removeDuplicate(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = 0;
				}
			}
		}

		for (int n : a) {
			if (n != 0) {
				System.out.print(n + ",");
			}
		}
	}

	public static void anotherWay(int[] a) {

		int res[] = new int[a.length];
		res[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < res.length; j++) {
				if (a[i] == res[j]) {
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				res[i] = a[i];
			}

		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] != 0) {
				System.out.print(res[i] + ",");
			}
		}
	}

}
