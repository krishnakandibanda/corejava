package com.array;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 elements -- ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("\n Array Sum is " + sum);
	}

}
