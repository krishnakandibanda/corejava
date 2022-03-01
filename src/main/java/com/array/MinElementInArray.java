package com.array;

//1)Methods with arguments and with return values
//2)Methods with arguments and without return values
//3)Methods without arguments and with return values
//4)Methods without arguments and without return values

public class MinElementInArray {
	public static void main(String[] args) {
		int[] minArray = new int[] { 7, 5, 2, 8 };
		int a = minValue(minArray);
		System.out.println("-Methods with arguments and with return values--Min--" + a);
		minElements(minArray);
		MinElementInArray min = new MinElementInArray();
		int minNumb = min.minNumber();
		System.out.println("----Min----" + minNumb);
		min.printMin();
	}

//1)Methods with arguments and with return values
	static int minValue(int[] value) {
		int min = value[0];
		for (int i : value) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

//2)Methods with arguments and without return values
	static void minElements(int[] num) {
		int min = num[0];
		int j = 0;
		while (j < num.length) {
			if (num[j] < min) {
				min = num[j];
			}
			j++;
		}
		System.out.println("...Min--" + min);
	}

//3)Methods without arguments and with return values
	int minNumber() {
		int[] a = new int[] { 7, 8, 1, 4 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

//4)Methods without arguments and without return values
	void printMin() {
		int[] min = new int[] { 4, 8, 9, 11 };
		int small = min[0];
		for (int i : min) {
			if (i < small) {
				small = i;
			}
		}
		System.out.println("--Small -- " + small);
	}

}
