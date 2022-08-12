package com.java8;

@FunctionalInterface
interface CheckAll {
	public int process(int a, int b);
}

public class AllInOneMethod {
	public static void main(String[] args) {
		// int p = 10, q = 20;

		CheckAll add = (p, q) -> {
			return (p + q);
		};
		CheckAll sub = (p, q) -> {
			return (p - q);
		};
		CheckAll mul = (p, q) -> {
			return (p * q);
		};
		CheckAll div = (p, q) -> {
			int a = p / q;
			return a;
		};

		System.out.println("--Add--(10,5)--" + add.process(10, 5));
		System.out.println("--Sub---" + sub.process(10, 5));
		System.out.println("--Mul---" + mul.process(10, 5));
		System.out.println("--Div---" + div.process(10, 5));

		add.process(10, 5);
		sub.process(10, 5);
		mul.process(10, 5);
		div.process(10, 5);

		addValueAnotherMethod(add);
		addValueAnotherMethod(sub);
		addValueAnotherMethod(mul);
		addValueAnotherMethod(div);
	}

	public static void addValueAnotherMethod(CheckAll cal) {
		int a = 5;
		int to = a + cal.process(20, 10);
		System.out.println("every call add 5,process(20,10)---" + to);
	}
}
