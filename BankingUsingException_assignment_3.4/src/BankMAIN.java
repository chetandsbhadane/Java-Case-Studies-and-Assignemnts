import java.util.Scanner;
public class BankMAIN {

	public static void main(String[] args) throws NegativeAmt{
		Scanner sc = new Scanner(System.in);
		BankingInfo binfo = new BankingInfo();
		BankAccount baObj = null;

		int ch1;
		
		do {
			System.out.println("1)Create Account\n2)Check Ac Details\n3)Deposit Amt\n4)Withdraw Amt");
			System.out.println("Enter your choice..");
			int ch = sc.nextInt();
			switch(ch) {

			case 1:
				baObj = binfo.create();
				break;

			case 2:
				if(baObj.getAccType() == 1) {
					System.out.println("---------Saving Account---------");
				}
				else {
					System.out.println("---------Current Account---------");
				}
				binfo.display(baObj);
				break;

			case 3:
				System.out.println("enter amt to deposit..");
				float amt = binfo.deposit(0);
				try {
					if(amt < 0) {
						throw new NegativeAmt("Enter valid amount...");
					}
					else {
						double currbal = baObj.getAccBal();
						double newbal = currbal+amt;
						baObj.setAccBal(newbal);
						System.out.println("new bal is : " + newbal);
					}
				}
				catch(NegativeAmt e){
					System.out.println(e);
				}
				break;
				
			case 4:
				System.out.println("Enter amount to withdraw..");
				float wAmt = binfo.withdraw(0);
				try {
					if((baObj.getAccBal() > 1000 ) && (baObj.getAccType() == 1)) {
						double currbal = baObj.getAccBal();
						double newbal = currbal-wAmt;
						baObj.setAccBal(newbal);
						System.out.println("new bal is : " + newbal);
					}
//					else {
//						throw new InsufficientFunds("You can not performed transaction minimum bal required 1000rs");
//					}
					else if((baObj.getAccType() == 2) && (baObj.getAccBal() < 5000)){
						double currbal = baObj.getAccBal();
						double newbal = currbal-wAmt;
						baObj.setAccBal(newbal);
						System.out.println("new bal is : " + newbal);
					}
					else {
						if((baObj.getAccBal() < 1000 ) && (baObj.getAccType() == 1)) {
							throw new InsufficientFunds("You can not performed transaction minimum bal required 1000rs");
						}
						else if((baObj.getAccType() == 2) && (baObj.getAccBal() < 5000)){
							throw new InsufficientFunds("You can not performed transaction minimum bal required 5000rs");
						}
					}
				}
				catch(InsufficientFunds e) {
					System.out.println(e);
				}
			}
			System.out.println("press 1 to continue...");
			ch1 = sc.nextInt();
		}while(ch1==1);

	}

}
