package com.java8;

public class Person {

	String name;
	Integer id;
	double salary;

	/*
	 * public Person() { super(); }
	 */
	public Person(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", id=" + this.id + ", salary=" + this.salary + "]";
	}

}
