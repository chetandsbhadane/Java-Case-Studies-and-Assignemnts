import java.util.Scanner;

public class EmpInfo {
	
	Scanner sc = new Scanner(System.in);
	
	public Emp calculateHRA() {
		System.out.println("Enter empID ");
		int eId = sc.nextInt();
		
		System.out.println("Enter emp Name ");
		String eName = sc.next();
		
		System.out.println("Enter designation - 1)Manager 2)Officer 3)Clerk");
		
		String eDes = sc.next();
		
		System.out.println("Enter basic salary ");
		double eBasic = sc.nextDouble();
		
		if(eDes.equals("Manager")) {
			eBasic = eBasic * 0.1;
		}
		else if(eDes.equals("Officer")) {
			eBasic = eBasic * 0.12;
		}
		else if(eDes.equals("Clerk")) {
			eBasic = eBasic * 0.05;
		}
		
		Emp eObj = new Emp(eId, eName, eDes, eBasic);
		return eObj;
	}
	
	public void printDET(Emp e) {
		System.out.println("Emp Id : " + e.getEmpId());
		System.out.println("Emp Name : " + e.getEmpNameString());
		System.out.println("Designation : " + e.getDesignation());
		System.out.println("Basic Sal : " + e.getBasic());
//		System.out.println("HRA : " + e.getHra());
	}
	
}
