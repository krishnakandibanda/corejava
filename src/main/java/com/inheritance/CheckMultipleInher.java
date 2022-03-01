package com.inheritance;

interface Parent1 {
	/*
	 * default void show() { System.out.println("--Parent1 - Show()--"); }
	 */

	void add();
}

interface Parent2 {
	/*
	 * default void show() { System.out.println("--Parent2 - Show()--"); }
	 */

	void add();
}

public class CheckMultipleInher implements Parent1, Parent2 {

	public static void main(String[] args) {
		CheckMultipleInher ml = new CheckMultipleInher();
		// ml.show();
	}

	/*
	 * @Override public void show() { // TODO Auto-generated method stub
	 * Parent2.super.show(); }
	 */
	@Override
	public void add() {
	}

	/*
	 * @Override public void show() { System.out.println("--Main-- Show()--"); }
	 */
}

class Demo implements Parent1, Parent2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
	}

	@Override
	public void add() {
		System.out.println("--Main---");
	}
}
