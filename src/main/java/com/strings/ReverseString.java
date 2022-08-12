package com.strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Please enter any String---");
		String str = sc.nextLine();
		System.out.println(str + "--Given String And Length is--" + str.length());

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("--Given String--Reverse String is--" + reverse);
		whileLoop(str);
		doWhileLoop(str);
	}

	public static void whileLoop(String str) {
		String rev = "";
		int i = str.length() - 1;
		while (i >= 0) {
			rev = rev + str.charAt(i);
			i--;
		}
		System.out.println("--Reverse-String-While-Loop------" + rev);
	}

	public static void doWhileLoop(String str) {
		String rev = "";
		int i = str.length() - 1;
		do {
			rev = rev + str.charAt(i);
			i--;
		} while (i >= 0);
		System.out.println("--Reverse-String-Do-While-Loop----" + rev);
	}

}
