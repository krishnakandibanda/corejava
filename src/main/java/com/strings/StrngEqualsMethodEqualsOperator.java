package com.strings;

public class StrngEqualsMethodEqualsOperator {
	public static void main(String[] args) {

		String s1 = new String("Krishna");
		String s2 = new String("suresh");
		System.out.println("...  == ... Equals operator ..." + (s1 == s2));
		System.out.println("... Equals() ... Equals method... " + (s1.equals(s2)));

		String s3 = "Krishna";
		String s4 = "Krishna";

		System.out.println("...  == ... Equals operator  s1==s3..." + (s1 == s3));
		System.out.println("... Equals()... Equals method.. s1.equals(s3).. " + (s1.equals(s3)));
		System.out.println("...  == ... Equals operator .s3==s4 .." + (s3 == s4));
		System.out.println("... Equals() -- Equals method.s3.equals(s4) .. " + (s3.equals(s4)));

	}
}
