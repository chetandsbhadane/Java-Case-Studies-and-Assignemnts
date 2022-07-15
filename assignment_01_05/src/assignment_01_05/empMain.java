package assignment_01_05;

public class empMain {

	public static void main(String[] args) {
		
		empInfo eObj = new empInfo();
		Employee e1 = eObj.create();
		eObj.display1(e1);
		
		Employee e2 = eObj.create();
		eObj.display2(e2);
		
		Employee e3 = eObj.create();
		eObj.display3(e3);
		
		Employee e4 = eObj.create();
		eObj.display4(e4);
		
		Employee e5 = eObj.create();
		eObj.display5(e5);

	}
}
