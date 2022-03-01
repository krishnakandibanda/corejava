package com.java8;

import java.util.Objects;

public class Employee {

	Integer empId;
	String empName;
	String empFName;
	Character empGrade;
	Double empSaraly;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String empFName, Character empGrade, Double empSaraly) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empFName = empFName;
		this.empGrade = empGrade;
		this.empSaraly = empSaraly;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpFName() {
		return this.empFName;
	}

	public void setEmpFName(String empFName) {
		this.empFName = empFName;
	}

	public Character getEmpGrade() {
		return this.empGrade;
	}

	public void setEmpGrade(Character empGrade) {
		this.empGrade = empGrade;
	}

	public Double getEmpSaraly() {
		return this.empSaraly;
	}

	public void setEmpSaraly(Double empSaraly) {
		this.empSaraly = empSaraly;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + this.empId + ", empName=" + this.empName + ", empFName=" + this.empFName
				+ ", empGrade=" + this.empGrade + ", empSaraly=" + this.empSaraly + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empFName, empGrade, empId, empName, empSaraly);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(this.empFName, other.empFName) && Objects.equals(this.empGrade, other.empGrade)
				&& Objects.equals(this.empId, other.empId) && Objects.equals(this.empName, other.empName)
				&& Objects.equals(this.empSaraly, other.empSaraly);
	}

}
