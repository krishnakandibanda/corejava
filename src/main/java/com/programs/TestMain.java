package com.programs;

class A {
	static int i = 1111;

	static {
		i = i-- - --i;
	}

	{
		i = i++ + ++i;
	}
}

class B extends A {
	static {
		i = --i - i--;
	}

	{
		i = ++i + i++;
	}
}

public class TestMain {

	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.i);

		Integer i1 = 2;

		Integer i2 = 2;

		System.out.println(i1 == i2);

		int i3 = 1201;

		int i4 = 1201;

		System.out.println(i3 == i4);

		Integer i = new Integer(i3);

		String s = new String();

	}
}
