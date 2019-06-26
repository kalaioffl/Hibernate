package com.gits.Hibernate;

import javax.persistence.Embeddable;

@Embeddable

public class EmployeeNameClass {
	
	private String Fname;
	private String Lname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String Fname) {
		this.Fname = Fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String Lname) {
		this.Lname = Lname;
	}
	@Override
	public String toString() {
		return "EmployeeNameClass [Fname=" + Fname + ", Lname=" + Lname + "]";
	}
	
	

}
