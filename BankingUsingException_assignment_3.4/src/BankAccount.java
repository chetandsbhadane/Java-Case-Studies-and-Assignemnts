import java.util.Scanner;

public class BankAccount {
	
	Scanner sc = new Scanner(System.in);
	
	private int accNum;
	private String custName;
	private int accType;
	private double accBal;
	public BankAccount(int accNum, String custName, int accType, double accBal) {
		super();
		this.accNum = accNum;
		this.custName = custName;
		this.accType = accType;
		this.accBal = accBal;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccType() {
		return accType;
	}
	public void setAccType(int accType) {
		this.accType = accType;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
	public void withdraw() {
		
	}
	
	public void getBalance() {
		
	}

}
