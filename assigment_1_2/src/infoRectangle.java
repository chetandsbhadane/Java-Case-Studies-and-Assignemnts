import java.util.Scanner;

public class infoRectangle {
	
	public Rectangle create() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the Rectangle");
		double lenght = sc.nextDouble();
		
		System.out.println("Enter breadth of the Rectangle");
		double breadth = sc.nextDouble();
		
		double areaRect = lenght*breadth;
		
		Rectangle areaObj = new Rectangle(lenght, breadth, areaRect);
		
		return areaObj;
	}
	
	public void showArea(Rectangle areaObj) {
		System.out.println("The length of Rectangle is " + areaObj.getLenght());
		System.out.println("The breadth of Rectangle is " + areaObj.getBreadth());
//		double ar = areaObj.getLenght() * areaObj.getBreadth();
		System.out.println("The area of rectangle is " + areaObj.getAreaRect());
	}
}
