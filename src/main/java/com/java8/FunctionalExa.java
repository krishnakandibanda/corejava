package com.java8;

@FunctionalInterface
interface FuncExample {
	void print();
}

public class FunctionalExa {

	static void executeFuncInterf(FuncExample cal) {
		cal.print();
	}

	public static void main(String[] args) {

		// Old way1 calling
		executeFuncInterf(new FuncExample() {
			@Override
			public void print() {
				System.out.println("---old way of defining anonymous inner class");
			}
		});

		// Old way2 calling
		FuncExample ex = new FuncExample() {
			@Override
			public void print() {
				System.out.println("---still old way of defining anonymous inner class");
			}
		};
		executeFuncInterf(ex);

		// new way using lambda
		executeFuncInterf(() -> {
			System.out.println("---new way of defining anonymous inner class using lambda");
		});

	}
}
