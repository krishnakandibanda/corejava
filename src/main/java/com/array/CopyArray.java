package com.array;

public class CopyArray {

	public static void main(String[] args) {
		int array[] = new int[] { 12, 3, 18, 10, 3, 8, };
		System.out.println("--Array-Length--" + array.length + "\n");
		copyArray(array);
		reverseArray(array);
		duplicateElements(array);
		ascendingOrder(array);
		descendingOrder(array);
	}

	public static void copyArray(int a[]) {
		int copyArray[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			copyArray[i] = a[i];
		}
		System.out.println("----Original Array----");
		for (int or : a) {
			System.out.print(" " + or);
		}
		System.out.println("\n----Copy Array----");
		for (int ca : copyArray) {
			System.out.print(" " + ca);
		}
	}

	public static void reverseArray(int re[]) {
		int reverseArray[] = new int[re.length];
		System.out.println("\n----Reverse Array----");
		for (int i = re.length - 1; i >= 0; i--) {
			System.out.print(" " + re[i]);
		}
	}

	public static void duplicateElements(int dup[]) {
		System.out.println("\n----Duplicate Elements----");
		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] == dup[j]) {
					System.out.print(" " + dup[j]);
				}
			}
		}
	}

	public static void ascendingOrder(int asc[]) {
		// 1,2,3,4,.....
		System.out.println("\n----Ascending-Order----");
		int temp = 0;
		for (int i = 0; i < asc.length; i++) {
			for (int j = i + 1; j < asc.length; j++) {
				if (asc[i] > asc[j]) {
					temp = asc[i];
					asc[i] = asc[j];
					asc[j] = temp;
				}
			}
		}
		for (int te : asc) {
			System.out.print(" " + te);
		}
	}

	public static void descendingOrder(int desc[]) {
		// 5,4,3,2,1,0.....
		System.out.println("\n----Descending-Order-----");
		int temp = 0;
		for (int i = 0; i < desc.length; i++) {
			for (int j = i + 1; j < desc.length; j++) {
				if (desc[i] < desc[j]) {
					temp = desc[i];
					desc[i] = desc[j];
					desc[j] = temp;
				}
			}
		}
		for (int te : desc) {
			System.out.print(" " + te);
		}
	}

}
