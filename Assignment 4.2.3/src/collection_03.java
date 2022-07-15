import java.util.Scanner;
import java.util.Vector;

public class collection_03 {

	public static void main(String[] args) {
//		3.	Implement vector class for this problem
//		1.	Create an Employee class which will have details like EmployeeNo, 
//		EmployeeName and Address. You should pass value for EmployeeNo, EmployeeName 
//		and Address through constructor.
//		2.	Create a method addInput( ) which will add employee details to vector.
//		3.	Create method display( ) which should display all data from vector using 
//		Enumeration.
//
//		Note :  addInput( ) and display( ) should not be member functions of 
//		Employee class.  
		
		vectorInfo v = new vectorInfo();
		Vector<Employee> eObj = v.addInput();
		v.display(eObj);

	}

}
