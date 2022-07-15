import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collection_1 {

	public static void main(String[] args) {
//		1.	Write a program to add list of student names to ArrayList and it should find a particular name whether 
//	       it exists or not in the list.
		
		List<String> lst = new ArrayList<String>();
		lst.add("Suresh");
		lst.add("Ganesh");
		lst.add("Mahesh");
		lst.add("Rakesh");
		System.out.println("Enter name you want to search in list..");
		Scanner sc = new Scanner(System.in);
		System.out.println(lst.contains(sc.next()));

	}

}
