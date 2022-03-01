package com.java8;

abstract class AbstractClassTest {
	abstract void print();
}

public class AbstractClassDemo {
	public static void main(String[] args) {

		AbstractClassTest abstractClass = new AbstractClassTest() {
			@Override
			void print() {
				System.out.println("AbstractClass --print()-calling-oldway");
			}
		};
		abstractClass.print();

// New way using lambda
// AbstractClass abstractClass1 = () -> System.out.println("show called new way");

	}
}
