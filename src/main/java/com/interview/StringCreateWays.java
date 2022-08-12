package com.interview;

//How many ways to create string object in java
public class StringCreateWays {

	public static void main(String[] args) {

		// Using String literal
		String str1 = "HELLO";
		// Using new keyword
		String str2 = new String("HELLO");
		// Using character array
		char ch[] = { 'H', 'E', 'L', 'L', 'O' };
		String str3 = new String(ch);
		// StringBuffer:
		StringBuffer str4 = new StringBuffer("HELLO");
		// StringBuilder:
		StringBuilder str5 = new StringBuilder("HELLO");

		System.out.println("Using String literal      ---   " + str1);
		System.out.println("Using new keyword         ---   " + str2);
		System.out.println("Using character array     ---   " + str3);
		System.out.println("Using StringBuffer:       ---   " + str4);
		System.out.println("Using StringBuilder:      ---   " + str5);

	}
}
