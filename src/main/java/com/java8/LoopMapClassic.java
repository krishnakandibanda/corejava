package com.java8;

import java.util.HashMap;
import java.util.Map;

public class LoopMapClassic {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 12);
		map.put("E", 11);
		map.put(null, null);
		map.put("C", 14);
		map.put(null, 20);
		map.put("A", 12);
		map.put("A", null);
		map.put("B", 11);
		map.put("F", 10);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		// Lambda
		map.forEach((k, v) -> System.out.println("Lambda Key : " + k + ", Value : " + v));

		// ensure map is not null
		if (map != null) {
			map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
		}

		map.forEach((k, v) -> {
			if (k != null && v != null) {
				System.out.println("Not Null Key : " + k + ", Not Null Value : " + v);
			}
		});

	}
}
