package com.strings;

public class StringQuiz {
	public static void main(String[] args) {

		String str = " ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		// System.out.println(str.charAt(0));

		String s1 = "null" + null + 1;
		System.out.println(s1);

		System.out.println("ONE" + 2 + 3 + 4 + "FIVE");
		System.out.println("A".compareTo("B"));
		System.out.println("A".compareTo("A"));
		System.out.println("B".compareTo("A"));

		"AB12ab".chars().forEach(System.out::println);

		System.out.println("JAVA" + 1000 + 2000 + 3000);
		System.out.println(1000 + 2000 + 3000 + "JAVA");

		// String s1 = 1+null+"null";
		System.out.println(7.7 + 3.3 + "JAVA" + 3.3 + 7.7);
		// System.out.println("JAVAJ2EE".substring(2, 5).substring(1).charAt(2));
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer("11111");
		System.out.println(sb2.insert(3, false).insert(5, 3.3).insert(7, "ONE"));

		String s = "8".repeat(5);
		System.out.println(s);

		System.out.println("Java" == new String("Java"));
		String str1 = "  Java\tConcept\tOf\tThe\tDay     ".strip();
		System.out.println(str1);

		if ("string".toUpperCase() == "STRING") {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// String, StringBuffer and StringBuilder – all these three classes are final
		// classes. True or False?

		String str2 = "Java";
		String str3 = "Java";
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		System.out.println(str2.hashCode() == str3.hashCode());

	}
}
