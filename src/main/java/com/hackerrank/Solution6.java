package com.hackerrank;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (scan.hasNext()) {
			i++;
			System.out.println(i + " " + scan.nextLine());
		}
	}

	public static void test() {
		int count = 1;
		try (Scanner in = new Scanner(System.in)) {
			while (in.hasNext()) {
				System.out.println(count + " " + in.nextLine());
				++count;
			}
		}
	}

	public static void demo() {
		try (Scanner scanner = new Scanner(System.in)) {
			int i = 1;
			while (scanner.hasNextLine()) {
				System.out.println(String.format("%d %s", i++, scanner.nextLine()));
			}
		}
	}
}
