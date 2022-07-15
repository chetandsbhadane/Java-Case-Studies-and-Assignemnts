
public class assignemnt_1_9 {

	public static void main(String[] args) {

		//		9.	Write a program that allows you to create an integer array of 
		//		18 elements with the following values: int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}. 
		//		The program computes the sum of element 0 to 14 and stores it at element 15,
		//		computes the average and stores it at element 16 and identifies the smallest
		//		value from the array and stores it at element 17.

		int sum = 0;
		int avg = 0;
		int smallest = 0;
		int arr[] = new int[]{3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		smallest = arr[0];

		for(int i=0;i<arr.length-3;i++) {
			sum = sum + arr[i];
		}

		for(int i=0;i<arr.length-3;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		avg = sum/14;
		arr[15] = sum;
		arr[16] = avg;
		arr[17] = smallest;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
