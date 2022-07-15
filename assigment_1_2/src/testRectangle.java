
public class testRectangle {

	public static void main(String[] args) {
		
		infoRectangle findArea = new infoRectangle();
		Rectangle rectObj1 = findArea.create();
		findArea.showArea(rectObj1);
		
		Rectangle rectObj2 = findArea.create();
		findArea.showArea(rectObj2);
		
		Rectangle rectObj3 = findArea.create();
		findArea.showArea(rectObj3);
		
		Rectangle rectObj4 = findArea.create();
		findArea.showArea(rectObj4);
		
		Rectangle rectObj5 = findArea.create();
		findArea.showArea(rectObj5);
	}
}
