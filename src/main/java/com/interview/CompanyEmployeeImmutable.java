package com.interview;

final class EmployeeImmutable {

	private String name;
	private int empId;
	private Company company;

	public EmployeeImmutable(String name, int empId, Company company) {
		this.name = name;
		this.empId = empId;
		// this.company = company;
		this.company = new Company(company.getCompanyName(), company.getCompanySize());
	}

	public String getName() {
		return this.name;
	}

	public int getEmpId() {
		return this.empId;
	}

	public Company getCompany() {
		// return this.company;
		return new Company(company.getCompanyName(), company.getCompanySize());
	}

	@Override
	public String toString() {
		return "EmployeeImmutable [name=" + this.name + ", empId=" + this.empId + ", company=" + this.company + "]";
	}

}

public class CompanyEmployeeImmutable {

	public static void main(String[] args) {

		// creating 'Company' object
		Company company = new Company("Medium", 50);
		company.setCompanyName("Media");
		company.setCompanySize(20);
		// Company company1 = new Company("Medium", 50);

		System.out.println("Company Object is : " + company);
		// System.out.println("Company Object is : " + company1);

		// creating 'Employee' object
		EmployeeImmutable employee = new EmployeeImmutable("Ram", 1000, company);

		System.out.println("Employee Object is : " + employee);
	}
}
