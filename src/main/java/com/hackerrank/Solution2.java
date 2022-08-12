package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, N, print its first 10  multiples. 
Each multiple N x i  (where 1 <= i <=10 ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, N.

Constraints
  
   2 <= N <= 20

Output Format

Print  10 lines of output; each line i  (where  1 <= i <= 10 ) contains the result of N x i in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
  
 */

public class Solution2 {

	public static void main(String[] args) {
		multiplicationTableOne();
		// multiplicationTable();
	}

	public static void multiplicationTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Enter N value 2 and 20--");
		int N = sc.nextInt();
		if (N >= 2 || N <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + "  x  " + i + "  =  " + N * i);
			}
		}
	}

	public static void multiplicationTableOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--Enter N value 2 and 20--");
		int N = sc.nextInt();
		if (N >= 2 || N <= 20) {
			for (int i = 1; i <= 10; i++) {
				// System.out.println(N + " x " + i + " = " + N * i);
				System.out.printf(" %d  x  %d  =  %d \n ", N, i, N * i);
			}
		}
	}

	public static void multiplicationTableWay() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println("--please enter n value 2 to 20");
		if (N >= 2 || N <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + N * i);
			}
		}
		bufferedReader.close();
	}

}
