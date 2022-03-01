package com.inheritance;

interface Drawable {
	void draw();

	static void print() {
		System.out.println(".Print ...");
	}

	static int cube(int x) {
		return x * x * x;
	}
}

interface Drawable1 {
	static void print() {
	}
}

class Rectangle implements Drawable, Drawable1 {
	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}

	void print() {

	}
}

public class MultipleInheritance {
	public static void main(String[] args) {

		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
	}
}
