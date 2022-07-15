import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		
	    //Creating an object of Random class
	    Random random = new Random();
	    //Calling the nextInt() method
//	    System.out.println("A random int: " + random.nextInt());  
	    //Calling the overloaded nextInt() method
//	    System.out.println("A random int from 0 to 49: "+ random.nextInt(4));
	    int r = random.nextInt(4);
		
		Compartment c[] = new Compartment[10];
		c[0] = new FirstClass();
		c[1] = new Ladies();
		c[2] = new General();
		c[3] = new Luggage();
		c[4] = new FirstClass();
		c[5] = new Ladies();
		c[6] = new General();
		c[7] = new Luggage();
		c[8] = new FirstClass();
		c[9] = new Ladies();
		
		for(int i=1;i<r;i++) {
			display(c);
		}
		
		
	}
	public static void display(Compartment arr[]) {
		for(Compartment e:arr) {
			if(e instanceof FirstClass) {
				System.out.println("Yatriyan Krupaya Dyan De - " + e);
				e.notice();
			}
			else if(e instanceof Ladies) {
				System.out.println("Yatriyan Krupaya Dyan De - " + e);
				e.notice();
			}
			else if(e instanceof General) {
				System.out.println("Yatriyan Krupaya Dyan De - " + e);
				e.notice();
			}
			else if(e instanceof Luggage) {
				System.out.println("Yatriyan Krupaya Dyan De - " + e);
				e.notice();
			}
		}
	}
}
