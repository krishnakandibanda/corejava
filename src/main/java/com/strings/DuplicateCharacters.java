package com.strings;

import java.util.Scanner;

public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Please enter any String--");
		String str = sc.nextLine();
		System.out.println("---Length------" + str.length());

		String cap = str.toLowerCase();

		System.out.println("---lower---" + cap);
		dupChar(str);
	}

	public static void dupChar(String str) {
		int count;
		String lowStr = str.toLowerCase();
		char charArray[] = lowStr.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j] && charArray[i] != ' ') {
					count++;
					charArray[j] = '0';
				}
			}
			if (count > 1 && charArray[i] != '0') {
				System.out.println(charArray[i]);
			}
		}
	}
}
