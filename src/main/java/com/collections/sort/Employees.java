package com.collections.sort;

import java.util.Objects;

public class Employees {
	public int empId;
	public String empName;
	public int empAge;

	public Employees() {
		super();
	}

	public Employees(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return this.empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + this.empId + ", empName=" + this.empName + ", empAge=" + this.empAge + "]";
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(empAge, empId,
	 * empName); }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return this.empAge == other.empAge && this.empId == other.empId && Objects.equals(this.empName, other.empName);
	}

	/*
	 * @Override public int compareTo(Employees o) { // TODO Auto-generated method
	 * stub return 0; }
	 */

	/*
	 * @Override public int compareTo(Employees o) {
	 * 
	 * if (o.getEmpId() > this.getEmpId()) { return 1; } else if (o.getEmpId() <
	 * this.getEmpId()) { return -1; }
	 * 
	 * return 0; }
	 */

}
