package com.collections.sort;

public class Employee implements Comparable<Employee> {

	public int emplId;
	public String emplName;
	public double emplSalary;

	public Employee() {
		super();
	}

	public Employee(int emplId, String emplName, double emplSalary) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
		this.emplSalary = emplSalary;
	}

	public int getEmplId() {
		return this.emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmplName() {
		return this.emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public double getEmplSalary() {
		return this.emplSalary;
	}

	public void setEmplSalary(double emplSalary) {
		this.emplSalary = emplSalary;
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		int id = otherEmployee.emplId; // same type object
		if (this.emplId > id)
			return 1;
		else if (this.emplId < id)
			return -1;
		else
			return 0;
	}

	/*
	 * public int compareName(Employee emp1, Employee emp2) { return
	 * emp1.emplName.compareTo(emp2.emplName); }
	 * 
	 * 
	 */
}
