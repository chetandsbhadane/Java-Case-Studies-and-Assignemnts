import java.util.Scanner;

import linkcode.bank.info.AccountInfo;

public class AccountMain {

	public static void main(String[] args) {
		
		AccountInfo ainfo = new AccountInfo();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1-insert\n2-delete\n3-search");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				ainfo.create();
				break;
				
			case 2:
				ainfo.delete();
				break;
				
			case 3:
				ainfo.search();
				break;
				
			case 4:
				ainfo.update();
				break;
				
			case 5:
				ainfo.getAllRecord();
				break;
			}
		}while(sc.next().equals("yes"));

	}

}
