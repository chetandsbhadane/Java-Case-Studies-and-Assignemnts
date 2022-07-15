package assignment_01_05;

import java.util.Scanner;

public class empInfo {

	public Employee create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId, enter Name");
		date2 dObj = new date2(1, 9, 2000);
		Employee eObj = new Employee(sc.nextInt(), sc.next(), dObj);
		return eObj;
	}
	
	public void display1(Employee eObj) {
		System.out.println("Empolyee Id - \t" + eObj.getEmpId() + "\nEmployee Name - \t" + eObj.getEmpName() + "\nJoining Date - \t" + eObj.getDate2().day + " " + eObj.getDate2().month + " " + eObj.getDate2().year);
	}
	
	public void display2(Employee eObj) {
		System.out.println("Empolyee Id - \t" + eObj.getEmpId() + "\nEmployee Name - \t" + eObj.getEmpName() + "\nJoining Date - \t" + (eObj.getDate2().day + 2) + " " + (eObj.getDate2().month + 2) + " " + eObj.getDate2().year);
	}
	
	public void display3(Employee eObj) {
		System.out.println("Empolyee Id - \t" + eObj.getEmpId() + "\nEmployee Name - \t" + eObj.getEmpName() + "\nJoining Date - \t" + (eObj.getDate2().day + 4) + " " + (eObj.getDate2().month - 3) + " " + eObj.getDate2().year);
	}
	
	public void display4(Employee eObj) {
		System.out.println("Empolyee Id - \t" + eObj.getEmpId() + "\nEmployee Name - \t" + eObj.getEmpName() + "\nJoining Date - \t" + (eObj.getDate2().day + 12) + " " + (eObj.getDate2().month - 5) + " " + eObj.getDate2().year);
	}
	
	public void display5(Employee eObj) {
		System.out.println("Empolyee Id - \t" + eObj.getEmpId() + "\nEmployee Name - \t" + eObj.getEmpName() + "\nJoining Date - \t" + (eObj.getDate2().day + 20) + " " + (eObj.getDate2().month - 8) + " " + eObj.getDate2().year);
	}
}
