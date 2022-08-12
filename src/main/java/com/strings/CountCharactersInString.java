package com.strings;

import java.util.Scanner;

public class CountCharactersInString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Please Enter Any String---");
		String str = sc.nextLine();

		int count = 0;
		System.out.println(str + "---The entered string is: " + str.length());
		// using a for loop
		// Count the characters in the string except space
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		// Displays the total number of characters in the string
		System.out.println("Total number of characters in the string for Loop : " + count);

		whileLoop(str);
		doWhileLoop(str);
	}

	public static void whileLoop(String str) {
		int count = 0, i = 0;
		while (i < str.length()) {
			if (str.charAt(i) != ' ') {
				count = count + 1;
			}
			i++;
		}
		System.out.println("----Count-While-Loop----" + count);
	}

	public static void doWhileLoop(String st) {
		int count = 0, i = 0;
		do {
			if (st.charAt(i) != ' ') {
				count++;
			}
			i++;
		} while (i < st.length());
		System.out.println("----Count-Do-While-Loop----" + count);
	}

}
