package com.interview;

public class Company {

	private String companyName;
	private int companySize;

	public Company(String companyName, int companySize) {
		this.companyName = companyName;
		this.companySize = companySize;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getCompanySize() {
		return this.companySize;
	}

	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + this.companyName + ", companySize=" + this.companySize + "]";
	}

}
