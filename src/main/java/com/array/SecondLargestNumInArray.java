package com.array;

public class SecondLargestNumInArray {
	public static void main(String[] args) {

		int array[] = new int[] { 7, 1, 8, 3, 9, 12, 6 };
		System.out.println("----Original-Array-----");
		print(array);
		System.out.println("\n----First-Largest-Number----");
		firstLargestNumber(array);
		System.out.println("\n----First-Smallest-Number---");
		firstSmallestNumber(array);
	}

	public static void print(int[] print) {
		for (int i : print) {
			System.out.print(" " + i);
		}
	}

	public static void firstLargestNumber(int[] first) {
		int temp;
		for (int i = 0; i < first.length; i++) {
			for (int j = i + 1; j < first.length; j++) {
				if (first[i] > first[j]) {
					temp = first[i];
					first[i] = first[j];
					first[j] = temp;
				}
			}
		}
		System.out.println("1st-LargestNum---" + first[first.length - 1]);
		System.out.println("2nd-LargestNum---" + first[first.length - 2]);
		System.out.println("3rd-LargestNum---" + first[first.length - 3]);
		System.out.println("-----Ascending-Order-Array-----");
		for (int k : first) {
			System.out.print(" " + k);
		}
		System.out.println("\n-----Descending-Order-Array-----");
		for (int i = first.length - 1; i >= 0; i--) {
			System.out.print(" " + first[i]);
		}
	}

	public static void firstSmallestNumber(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("1st Smallest----" + array[0]);
		System.out.println("2nd Smallest----" + array[1]);
		System.out.println("3rd Smallest----" + array[2]);
	}

}
