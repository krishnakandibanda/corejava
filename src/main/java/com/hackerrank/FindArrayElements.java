package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindArrayElements {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList();
		arr.add(5);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(1);
		int find = 9;
		findNumber(arr, find);
		System.out.println("---" + findNumber(arr, find));
	}

	public static String findNumber(List<Integer> arr, int k) {
		String res = "No";
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == k) {
				res = "Yes";
			}
		}
		return res;
	}

	public static List<Integer> oddNumbers(int l, int r) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				result.add(i);
			}
		}
		return result;
	}
}

class SolutionOne {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N % 2 != 0) {
			System.out.println("Weird");
		} else if (N % 2 == 0) {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N >= 6 && N <= 20) {
				System.out.println("Weird");
			} else if (N > 20) {
				System.out.println("Not Weird");
			}
		}
		scanner.close();
	}
}
