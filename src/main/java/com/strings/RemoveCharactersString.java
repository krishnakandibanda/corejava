package com.strings;

import java.util.Scanner;

public class RemoveCharactersString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("---Please Enter Any String---");
		// String str = sc.nextLine();
		String str = "DemoanDDemo";

	}

	public static void removeCharacters(String str) {
		System.out.println("----Given String is---" + str);
		System.out.println("---length()--is---" + str.length());

		char[] ch = str.toCharArray();
		System.out.println("--Char[]--length-is--" + ch.length);

		char[] stri = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[i] = ' ';
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				System.out.print("," + ch[i]);
			}
		}
	}
}
