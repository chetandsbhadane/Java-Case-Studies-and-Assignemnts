
public class NegativeAmt extends Exception{
	
	String str;

	public NegativeAmt(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception : " + str;
	}

	
	

}
