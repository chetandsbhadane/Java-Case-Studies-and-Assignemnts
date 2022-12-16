
public class InsufficientFunds extends Exception{
	
	String str;

	public InsufficientFunds(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception : " + str;
	}
}
