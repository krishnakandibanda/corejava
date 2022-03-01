package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachConsumer {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Nandhu", "Krish", "Veda", "Sriniva", "null");

		Stream<String> stream = Stream.of("Nandhu", "Krish", "Veda", "Sriniva", "null");

		// Lambda
		list.forEach(y -> System.out.println("---" + y));
		// method reference
		list.forEach(System.out::println);

		// stream.forEach(x -> System.out.println("**-" + x));
		// stream.forEach(System.out::println);

		Consumer<String> printTextInHexConsumer = (String str) -> {
			StringBuilder sb = new StringBuilder();
			for (char c : str.toCharArray()) {
				String hex = Integer.toHexString(c);
				sb.append(hex);
			}
			System.out.print(String.format("%n%-10s:%s", str, sb.toString()));
		};

		list.forEach(printTextInHexConsumer);
		stream.forEach(printTextInHexConsumer);
	}
}
