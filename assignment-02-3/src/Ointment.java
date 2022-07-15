
public class Ointment extends Medicine{

	@Override
	public void displaylabel() {
		String compName = "Pharma-Company";
		String compAddr = "Pune";
		System.out.println(compName);
		System.out.println(compAddr);
		
	}

	@Override
	public String toString() {
		return "for external use only..";
	}
	

}
