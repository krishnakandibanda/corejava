package com.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();

		while (n-- > 0) {
			int c = scan.nextInt();
			Integer frequency = colors.get(c);
			// If new color, add to map
			if (frequency == null) {
				colors.put(c, 1);
			} else { // Increment frequency of existing color
				colors.put(c, frequency + 1);
			}
		}
		scan.close();

		// Count and print the number of pairs
		int pairs = 0;
		for (Integer frequency : colors.values()) {
			pairs += frequency >> 1;
		}
		System.out.println(pairs);
	}
}
