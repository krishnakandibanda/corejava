package com.hackerrank;

import java.util.Scanner;

/*  
1)input

2
0 2 10
output
2 6 14 30 62 126 254 510 1022 2046

2)input

3
3 3 3
5 3 5
0 0 5
output
6 12 24 
8 14 26 50 98
0 0 0 0 0 
  
   
 
 */

public class Solution3 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.println("--Enter a,b,n---values");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {
				a = a + ((int) Math.pow(2, j) * b);
				System.out.print(a + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
