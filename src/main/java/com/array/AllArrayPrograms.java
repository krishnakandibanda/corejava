package com.array;

public class AllArrayPrograms {
	public static void main(String[] args) {
		int array[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 5, 7, 9 };
		// 0,1,2,3,4,5,6,7,8
		System.out.println("--Array-Length--" + array.length + "\n");

		copyArray(array);
		oddPosition(array);
		evenPosition(array);
		evenNumbers(array);
		oddNumbers(array);
		reverseArray(array);
		duplicateElements(array);
		ascendingOrder(array);
		descendingOrder(array);
		maxElementInArray(array);
		minElementInArray(array);
		removeDuplicate(array);
		thirdLargestInArray(array);

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
		// int reverseArray[] = new int[re.length];
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
					System.out.print(" " + dup[i]);
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

	public static void maxElementInArray(int max[]) {
		int maxValue = max[0];
		System.out.println("\n----Largest-Element-in-Array----");
		for (int i = 0; i < max.length; i++) {
			if (max[i] > maxValue) {
				maxValue = max[i];
			}
		}
		System.out.println("---Max-Value---" + maxValue);
	}

	public static void minElementInArray(int[] array) {
		int minValue = array[0];
		System.out.println("----Smallest-Elements-In-Array----");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		System.out.println("---Min-Value---" + minValue);
	}

	public static void removeDuplicate(int[] dup) {
		int[] temp = new int[dup.length];
		System.out.println("----Remove-Duplicate-Elements----");
		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] == dup[j]) {
					dup[i] = 0;
				}
			}
		}
		for (int re : dup) {
			if (re != 0) {
				System.out.print(" " + re);
			}
		}
	}

	public static void thirdLargestInArray(int[] dup) {
		int temp;
		System.out.println("\n---ThirdLargest-In-Array---");
		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] > dup[j]) {
					temp = dup[i];
					dup[i] = dup[j];
					dup[j] = temp;
				}
			}
		}
		System.out.println("--Third--" + dup[dup.length - 3]);
	}

	public static void evenPosition(int[] even) {
		System.out.println("\n-----Even-Positions----");
		for (int i = 0; i < even.length; i = i + 2) {
			System.out.print(" " + even[i]);
		}
	}

	public static void oddPosition(int[] odd) {
		System.out.println("\n---- Odd-Positions ----");
		for (int i = 1; i < odd.length; i = i + 2) {
			System.out.print(" " + odd[i]);
		}
	}

	public static void evenNumbers(int[] evenNum) {
		System.out.println("\n ----Even-Numbers----");
		for (int i = 0; i < evenNum.length; i++) {
			if (evenNum[i] % 2 == 0) {
				System.out.print(" " + evenNum[i]);
			}
		}
	}

	public static void oddNumbers(int[] oddNum) {
		System.out.println("\n-----Odd-Numbers----");
		for (int i = 0; i < oddNum.length; i++) {
			if (oddNum[i] % 2 != 0) {
				System.out.print(" " + oddNum[i]);
			}
		}
	}

}
