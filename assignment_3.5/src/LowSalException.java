
public class LowSalException extends Exception{
	
	String str;

	public LowSalException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		
		return "Exception - " + str;
	}
	
	
}
