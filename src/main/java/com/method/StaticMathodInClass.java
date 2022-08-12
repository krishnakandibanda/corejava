package com.method;

class Parent {
	public void display() {
		System.out.println("--void display---parent--");
	}

// Static method can override 
	public static void print() {
		System.out.println("---Static void print--parent--");
	}

	private void printPrivate() {
		System.out.println("---Private void printprivate --Parent--");
	}
}

class Child extends Parent {
	@Override
	public void display() {
		System.out.println("--void display---Child");
	}

	public static void print() {
		System.out.println("--Static void print--Child");
	}

	private void printPrivate() {
		System.out.println("---Private void printprivate--Child--");
	}

}

public class StaticMathodInClass {
	public void display() {
		System.out.println("void display---Main class");
	}

	public static void print() {
		System.out.println("Static void print---Main class");
	}

	private void printPrivate() {
		System.out.println("---Private void printprivate--main class--- ");
	}

	public static void main(String[] args) {
		StaticMathodInClass sm = new StaticMathodInClass();

		sm.display();
		print();
		sm.printPrivate();

		Parent p = new Child();
		p.display();
		p.print();

		Child c = new Child();
		c.display();
		c.print();

	}
}
