package com.employee.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long empId;
private String empFirstName;
private String empLastName;
private String empEmail;
private String empPhoneNumber;
private String empDob;
private int empSalary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Long empId, String empFirstName, String empLastName, String empEmail, String empPhoneNumber,
		String empDob, int empSalary) {
	super();
	this.empId = empId;
	this.empFirstName = empFirstName;
	this.empLastName = empLastName;
	this.empEmail = empEmail;
	this.empPhoneNumber = empPhoneNumber;
	this.empDob = empDob;
	this.empSalary = empSalary;
}
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getEmpPhoneNumber() {
	return empPhoneNumber;
}
public void setEmpPhoneNumber(String empPhoneNumber) {
	this.empPhoneNumber = empPhoneNumber;
}
public String getEmpDob() {
	return empDob;
}
public void setEmpDob(String empDob) {
	this.empDob = empDob;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
			+ ", empEmail=" + empEmail + ", empPhoneNumber=" + empPhoneNumber + ", empDob=" + empDob + ", empSalary="
			+ empSalary + "]";
}

}