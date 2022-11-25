package linkcode.bank.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linkcode.bank.Dao.AccountInterface;
import linkcode.bank.Dao.accountDao;
import linkcode.bank.model.Account;

public class AccountInfo {
	Scanner sc = new Scanner(System.in);
	public int create() {
		System.out.println("Enter acc num, name, bal");
		Account aObj = new Account(sc.nextInt(), sc.next(), sc.nextDouble());
		List<Account> lst = new ArrayList<Account>();
		lst.add(aObj);
		accountDao aDb = new accountDao();
		int i = aDb.create(lst);
		if(i>0) {
			System.out.println("record saved..");
		}
		return i;
	}

	public int delete() {
		System.out.println("Enter acc number to delete..");
		int acno = sc.nextInt();
		accountDao aDb = new accountDao();
		int i = aDb.delete(acno);
		if(i>0) {
			System.out.println("record deleted..");
		}
		return i;
	}
	
	public List<Account> search() {
		System.out.println("Enter acc number to search..");
		int acno = sc.nextInt();
		accountDao aDb = new accountDao();
		List<Account> i = aDb.search(acno);
		Account a = i.get(0);
		System.out.println(a.getAccNo() + "\t" + a.getCustName() + "\t" + a.getAccBal());
 		return i;
	}
	
	public List<Account> update() {
		System.out.println("Enter acc number to update..");
		int acno = sc.nextInt();
		System.out.println("Enter acc new bal to update..");
		double accBal = sc.nextDouble();
		accountDao aDb = new accountDao();
		List<Account> i = aDb.update(acno,accBal);
		Account a = i.get(0);
		System.out.println(a.getAccNo() + "\t" + a.getCustName() + "\t" + a.getAccBal());
 		return i;
	}
	
	public List<Account> getAllRecord() {
		accountDao aDb = new accountDao();
		List<Account> lst = aDb.displayAllRecords();
//		Account a = i.get(0);
		for(Account a:lst) {
			System.out.println(a.getAccNo() + "\t" + a.getCustName() + "\t" + a.getAccBal());
		}
		
 		return lst;
	}
}
