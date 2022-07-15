
public class assignment_1_6 {

	public static void main(String[] args) {

		String str = args[0];
		
		//length check code goes here..
		int len = 0;
		System.out.println("Given String is - " + str);
		for(int i=0;i<str.length();i++) {
			len++;
		}

		//length and uppercase print code goes here..
		System.out.println("The length is " + len);
		System.out.println("uppercase - " + str.toUpperCase());


		//pallindrome check code goes here..
		String rev;
		StringBuilder sb=new StringBuilder(str);  
		sb.reverse();   
		rev = sb.toString();

		if(str.equals(rev)) {
			System.out.println("pallindrome..");
		}
		else {
			System.out.println("Not pllimdrome..");
		}
	}
}
