package exceptionCaseStudy;

public class IlligalArgumentExceptionss extends Exception{
	
	String str;

	public IlligalArgumentExceptionss(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception : " + str;
	}
	
	

}
