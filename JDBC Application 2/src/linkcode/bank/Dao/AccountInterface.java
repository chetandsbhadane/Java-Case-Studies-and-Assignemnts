package linkcode.bank.Dao;

import java.util.List;

import linkcode.bank.model.Account;

public interface AccountInterface {
	
	public int create(List<Account> accObj);

	public int delete(int accno);
	
	public List<Account> search(int accno);
	
	public List<Account> update(int accno,double accBal);
	
	public List<Account> displayAllRecords();
}
