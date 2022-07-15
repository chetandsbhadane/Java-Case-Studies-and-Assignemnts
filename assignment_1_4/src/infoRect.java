import java.util.Scanner;

public class infoRect {
	 
	Scanner sc = new Scanner(System.in);
	public Rectangle Area() {
		System.out.println("Enter a length..");
		float l = sc.nextFloat();
		
		System.out.println("enter a breadth..");
		float b = sc.nextFloat();
		
		float aRect = 0;
		float perimeter = 0;
		if((l > 0 && b < 20.0)  || (b > 0 && l < 20.0)){
			aRect = l*b;
			perimeter = l + b + l + b;
//			System.out.println("The Area of Rect is : " + aRect);
//			System.out.println("The Perimeter of Rect is : " + perimeter);
		}
		
		Rectangle rObj = new Rectangle(l, b, aRect, perimeter);
		return rObj;
	}
	
	public void display(Rectangle r) {
		System.out.println("The area of rect is : " + r.getaRect());
		System.out.println("The Perimeter of Rect is : " + r.getP());
	}
}
