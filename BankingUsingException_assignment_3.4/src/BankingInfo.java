import java.util.Scanner;

public class BankingInfo {
	Scanner sc = new Scanner(System.in);
	public BankAccount create() {
		
		System.out.println("Enter Acc number");
		int accNumber = sc.nextInt();
		
		System.out.println("Enter Acc Name");
		String accName = sc.next();
		
		System.out.println("Enter Acc Balance");
		double accBal = sc.nextDouble();
		
		int acctype = 0;
		System.out.println("Enter Acc Type : 1)saving\n2)current");
		acctype =sc.nextInt();
		if((acctype==1) && (accBal >= 1000)) {
				System.out.println("Saving Account has been created");
		}
		else if(acctype==2 && accBal >= 5000){
			System.out.println("Current Account has been created");
		}
		else {
			if(acctype==1) {
				System.out.println("Saving Account Minimum Balance Required 1000 Rs..");
			}
			else if(acctype==2) {
				System.out.println("Saving Account Minimum Balance Required 5000 Rs..");
			}
		}
		
		BankAccount bbObj = new BankAccount(accNumber, accName, acctype, accBal);
		return bbObj;
	}
	
	public void display(BankAccount baccObj) {
		System.out.println("Account Number : " + baccObj.getAccNum());
		System.out.println("Account Name : " + baccObj.getCustName());
		System.out.println("Account Type : " + baccObj.getAccType());
		System.out.println("Account Balance : " + baccObj.getAccBal());
		
	}
	
	public float deposit(float amt) {
		float damt = sc.nextInt();
		return damt;
	}
	
	public float withdraw(float amt) {
		float damt = sc.nextInt();
		return damt;
	}
}
