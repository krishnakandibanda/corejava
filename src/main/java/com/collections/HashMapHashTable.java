package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapHashTable {
	public static void main(String[] args) {

		// --------------------HashTable---------------
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Krishna");
		ht.put(101, "Vikram");
		ht.put(102, "Venkatramana");
		ht.put(103, "Nanii");
		ht.put(104, "Vijay");
		// ht.put(null, "Vijay");
		ht.put(107, "Vijay");
		// ht.put(105, null);
		// ht.put(106, null);
		System.out.println("---------------Hash table------------------");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}
		// ------------------HashMap----------------------
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Krishna");
		hm.put(101, "Krish");
		hm.put(102, "Krishna");
		hm.put(103, "Vikki");
		hm.put(null, "Rahul");
		hm.put(null, "Vijay");
		hm.put(107, "Vijay");
		hm.put(105, null);
		hm.put(106, null);
		System.out.println("---------------Hash Map------------------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "---" + m.getValue());
		}

	}
}
