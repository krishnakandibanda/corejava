package com.array;

import java.util.Arrays;

public class DuplicateElementsInArray {
	public static void main(String[] args) {

		int index = 0;
		int[] arr = { 10, 20, 20, 50, 50, 45 };
		int size = arr.length;
		int[] revDup = new int[size];
		System.out.println("Before removing duplicate from the array:");

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + ",");
		}
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
					break;
				}
			}
			if (count == 0) {
				revDup[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < index; i++) {
			arr[i] = revDup[i];
		}
		System.out.println("\nAfter removing duplicate from the array:");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	static void ascendingValueinArray() {
		int[] array = new int[] { 9, 4, 1, 3, 5, 9 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	static void descendingArray() {
		int[] array = new int[] { 9, 4, 1, 3, 5, 9 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	static void uniqueArray() {
		int[] arr = { 6, 2, 3, 4, 2, 4, 6, 7 };
		int[] uniqueArr = new int[arr.length];
		int counter = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				uniqueArr[counter] = arr[i];
				counter++;
			}
		}
		uniqueArr[counter] = arr[arr.length - 1];
		System.out.println("Array with Unique Elements : ");
		for (int i = 0; i <= counter; i++) {
			System.out.print(uniqueArr[i] + " ");
		}
	}

}
