import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class vectorInfo {

	public Vector<Employee> addInput() {
		Scanner sc = new Scanner(System.in);
		Vector<Employee> vector = new Vector<Employee>();
		System.out.println("Enter EmpId, Name, Address");
		vector.add(new Employee(sc.nextInt(), sc.next(), sc.next()));
		return vector;
		
	}
	
	public void display(Vector<Employee> eObj) {
		Iterator<Employee> itr = eObj.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println("Emp Id is :- " + e.getEmpId());
			System.out.println("Emp Name is :- " + e.getEmpName());
			System.out.println("Emp Address is :- " + e.getEmpAddr());
		}
			
		
	}
}
