package assignment_01_05;


import java.util.Scanner;

public class Employee {
	
	private int empId;
	private String empName;
	private date2 date2;
	public Employee(int empId, String empName, date2 date2) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.date2 = date2;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public date2 getDate2() {
		return date2;
	}
	public void setDate2(date2 date2) {
		this.date2 = date2;
	}
	
	
}
