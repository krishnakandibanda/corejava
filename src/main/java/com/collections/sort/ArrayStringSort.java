package com.collections.sort;

import java.util.Arrays;

public class ArrayStringSort {

	public static void main(String[] args) {

		String[] cities = new String[] { "Pune", "Mumbai", "Chennai", "Banguleru", "Telangana" };
		int[] numbers = new int[] { 4, 5, 3, 2, 8 };

		Arrays.sort(cities);
		Arrays.sort(numbers);

		for (String city : cities) {
			System.out.println("City   --- " + city);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("..numbers by sort..." + numbers[i]);
		}
		for (int i : numbers) {
			// enhanced for loop
			System.out.println(" enhanced for loop---" + i);
		}

	}

}
