package com.strings;

import java.util.Scanner;

/*
 
Ex anagram Strings are given below:
god - dog
cat - act
angle - glean
arc - car
tar - rat
  
 */

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Please Enter Any String---");
		// String str = sc.nextLine();
		String str = "ABba";
		System.out.println("--- Given-String-IS ---" + str);
		anagramString(str);
		// anagramStr(str);
	}

	public static void anagramStr(String str) {
		String temp = str.toLowerCase();
		System.out.println(temp + "----" + temp.length());
		String reverse = " ";
		char[] rechar = str.toLowerCase().toCharArray();
		for (int i = rechar.length - 1; i >= 0; i--) {
			reverse = reverse + rechar[i];
		}
		// reverse.toLowerCase();
		System.out.println("------" + reverse.length());

		if (temp.equals(reverse)) {
			System.out.println("--Is Anagram--");
		} else {
			System.out.println("--Is Not Anagram--");
		}
	}

	public static void anagramString(String str) {
		String temp = new String(str).toLowerCase();
		System.out.println("---temp---" + temp);

		String reverse = "";
		char[] chartemp = str.toLowerCase().toCharArray();

		for (int i = chartemp.length - 1; i >= 0; i--) {
			// System.out.print(chartemp[i]);
			reverse = reverse + chartemp[i];
		}
		System.out.println("---" + reverse);
		if (temp.equals(reverse)) {
			System.out.println("-Is Anagram-");
		} else {
			System.out.println("-Is Not Anagram-");
		}
	}

}
