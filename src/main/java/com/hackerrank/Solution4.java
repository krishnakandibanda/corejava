package com.hackerrank;

import java.util.Scanner;

/*
 
--------------------------Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
 
 -------------------------Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
 
 
 */

public class Solution4 {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();

		for (long i = 0; i < t; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= -32768 && x <= 32767)
					System.out.println("* short");
				if (x >= -2147483648 && x <= 2147483647)
					System.out.println("* int");
				if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
					System.out.println("* long");
				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
	}
}
