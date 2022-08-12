package com.hackerrank;

import java.util.Scanner;

/*
1)input
java 100
cpp 65
python 50

output
================================
java           100
cpp            065
python         050
================================

2)input
hello 0
hackerrank 65
java 10

================================
hello          000
hackerrank     065
java           010
================================

*/

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// System.out.println(s1+" "+x+" ");
			System.out.printf("%-15s%03d%n", s1, x);
		}
		System.out.println("================================");
	}
}
