package com.array;

import java.util.Arrays;

/* Java program to find the frequency of each element of an array */
public class FrequencyElementArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 8, 7, 3, 8, 5 };
		// display the array using Arrays.toString()
		System.out.println(Arrays.toString(array));

		int[] vis = new int[array.length];
		int temp = -1;
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					vis[j] = temp;
				}
			}
			if (vis[i] != temp)
				vis[i] = count;
		}

		System.out.println("--Element--|--Frequency--");
		for (int i = 0; i < vis.length; i++) {
			if (vis[i] != temp)
				System.out.println("  " + array[i] + "        |       " + vis[i]);
		}
	}
}
