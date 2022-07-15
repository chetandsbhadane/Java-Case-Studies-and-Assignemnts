import java.util.Scanner;

public class Bookinfo {
	
	Scanner sc = new Scanner(System.in);
	public Book[] createBooks() {
		int n;
		System.out.println("How many books do you want??");
		n = sc.nextInt();
		Book arr[] = new Book[n];
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter book title");
			String bookTitle = sc.next();
			
			System.out.println("Enter book price");
			double bookPrice = sc.nextDouble();
			
			Book bookObj = new Book(bookTitle, bookPrice);
			arr[i] = bookObj;
		}
		return arr;
	}
	
	
	public void display(Book bookObj[]) {
		System.out.println("Book Title\t\tPrice");
		for(int i=0;i<bookObj.length;i++) {
			System.out.println(bookObj[i].getBookTitle() + "\t\t\t" + bookObj[i].getBookPrice());
		}
	}

}
