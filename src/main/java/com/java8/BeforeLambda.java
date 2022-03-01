package com.java8;

interface Operations {
	public void add();

	public void sub();

	public void mul();

	public void div();
}

//before java 8
//without Lambda
abstract class AdditionClass implements Operations {
	int a = 50, b = 20;

// abstractclass not create object
	@Override
	public void add() {
		int a = 10, b = 20;
		System.out.println("AbstractClass-Add()- 10,20----" + (a + b));
	}

	@Override
	public void sub() {
		System.out.println("AbstractClass-sub()--50,20----" + (a - b));
	}

}

class Test extends AdditionClass {

	@Override
	public void mul() {
	}

	@Override
	public void div() {
	}
}

class AllOperations implements Operations {
	int a = 10, b = 5;

	@Override
	public void add() {
		System.out.println("AllOperations--add()--" + (a + b));
	}

	@Override
	public void sub() {
		System.out.println("AllOperations--sub()--" + (a - b));
	}

	@Override
	public void mul() {
		System.out.println("AllOperations--mul()--" + (a * b));
	}

	@Override
	public void div() {
		System.out.println("AllOperations--div()--" + (a / b));
	}
}

public class BeforeLambda {
	public static void main(String[] args) {
		// AdditionClass ac = new AdditionClass();
		BeforeLambda ao = new BeforeLambda();
		AllOperations all = new AllOperations();
		all.add();
		all.sub();
		all.mul();
		all.div();
		Test t = new Test();
		t.add();
		t.sub();
		t.div();
	}
}
