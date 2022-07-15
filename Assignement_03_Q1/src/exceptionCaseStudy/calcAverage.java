package exceptionCaseStudy;

import java.util.Scanner;

public class calcAverage {

	public static void main(String[] args) throws IlligalArgumentExceptionss {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of N : ");
		int N = sc.nextInt();
		int sum=0,avg;
		
		try {
			if(N>1) {
				for(int i=0;i<N;i++) {
					sum =  sum + (N-i);
				}
				avg = sum/N;
				System.out.println("The average is : " + avg);
			}
			else {
				System.out.println("Please enter natural number");
				throw new IlligalArgumentExceptionss("occur");
			}

		}
		catch(IlligalArgumentExceptionss e) {
			System.out.println(e);
		}
	}

}
