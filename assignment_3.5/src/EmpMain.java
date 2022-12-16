import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) throws LowSalException{
		Scanner sc = new Scanner(System.in);
		EmpInfo einfo = new EmpInfo();
		Emp eObj = null;

		do {
			System.out.println("1-Create Employee\n2-Display Employee");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				eObj = einfo.calculateHRA();
				try {
					if(eObj.getBasic() < 500) {
						throw new LowSalException("Basic Salary of " + eObj.getDesignation() + " is less than 500");

					}
					else {
						einfo.printDET(eObj);
					}
				} catch (LowSalException e) {
					System.out.println(e);
				}
				break;

			case 2:
				einfo.printDET(eObj);
				break;

			}
		System.out.println("Do you want to continue? press yes");
		}while(sc.next().equals("yes"));

	}

}
