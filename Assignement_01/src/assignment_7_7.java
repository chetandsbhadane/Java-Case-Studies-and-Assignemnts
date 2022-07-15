
public class assignment_7_7 {

	public static void main(String[] args) {
		
		String s1 = args[0];
		String s2 = args[1];
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int i,j,k,cnt;
		
		System.out.println(n1);
		System.out.println(n2);
		for(cnt=1;cnt<14;cnt++){ //1,  2,  3
			
			k = n1+n2;  //k = 0+1 = 1, 1 + 1 = 2, 1 + 2= 3
			System.out.println(k); //1,2
			n1 = n2; //i = 1, i = 1
			n2 = k; // j = 1, j = 2
		}

	}

}
