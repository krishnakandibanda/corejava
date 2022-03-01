package com.programs;

public class Factor {
	public static void main(String[] args) {
		int num = 8;
		System.out.println(num + " Factor are --");
		returnFactor(num);
	}

	static void returnFactor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print("  " + i);
			}
		}
	}
}
