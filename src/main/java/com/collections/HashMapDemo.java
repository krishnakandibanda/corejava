package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 50);
		map.put("D", 40);
		map.put("A", 50);
		System.out.println("SIZE OF MAP IS :---" + map.size());
		System.out.println(map);

		if (map.containsKey("A")) {
			Integer a = map.get("A");
			System.out.println("value  of Key " + "\"A\" is :--" + a);
		}

		for (String key : map.keySet()) {
			System.out.println("Key : " + key + ",  value : is-" + map.get(key));
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key " + entry.getKey() + ", value : " + entry.getValue());
		}
	}

}
