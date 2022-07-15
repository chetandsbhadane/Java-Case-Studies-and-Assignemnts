import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class collection_02 {

	public static void main(String[] args) {
//		2.	Create a Product class with Product Id & Product Name.
//		Write a program to accept information of 10 products and store that in Hash Table. 
//		Search a particular product in the Hash Table. 
//		Remove a particular product id and product name from the Hash Table. 
//		The product list is as follows:
//		Product Id	Product Name
//		P001	Maruti800
//		P002	MarutiZen
//		P003	MarutiEsteem
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(001, "Maruti800");
		hashmap.put(002, "MarutiZen");
		hashmap.put(003, "MarutiEsteem");
		hashmap.put(004, "Suzuki");
		hashmap.put(005, "bmw");
		hashmap.put(006, "eritica");
		hashmap.put(007, "audi");
		hashmap.put(8, "swift");
		hashmap.put(9, "mercedes");
		hashmap.put(10, "benz");
		
		System.out.println(hashmap);
		System.out.println(hashmap.containsValue(sc.next()));
		System.out.println("Enter Prod Id to remove..");
		System.out.println(hashmap.remove(sc.nextInt()));
		System.out.println(hashmap.remove(sc.nextInt()));
		System.out.println(hashmap.remove(sc.nextInt()));
		System.out.println(hashmap);
		
		

	}

}
