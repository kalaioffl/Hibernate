package com.gits.Hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeNameClass")

public class EmployeeDetails  {
	
	@Id

	private int      EmployeeId;
	private EmployeeNameClass EmployeeName;
	private String   EmployeeAddress;
	public void setEmployeeName(EmployeeNameClass employeeName) {
		EmployeeName = employeeName;
	}
	public void setEmployeemail(String employeemail) {
		Employeemail = employeemail;
	}
	private String   Employeemail;
	
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId ) {
		this.EmployeeId = EmployeeId;
	}
	//public String getEmployeeName() {
		//return EmployeeName;
	//}
	//public void setEmployeeName(String EmployeenName, String EmployeeName) {
		//this.EmployeeName = EmployeeName;
	//}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String EmployeeAddress) {
		this.EmployeeAddress = EmployeeAddress;
	}
	public String getEmployeemail() {
		return Employeemail;
	}
	public void setEmployeeMail(String EmployeeMail) {
		this.Employeemail = EmployeeMail;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAddress="
				+ EmployeeAddress + ", Employeemail=" + Employeemail + "]";
	}
}
