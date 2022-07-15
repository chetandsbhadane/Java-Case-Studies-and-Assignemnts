import java.util.Scanner;

public class assignment_1_1 
{
	Scanner sc=new Scanner(System.in);
	
	public void even()
	{
		int n;
		System.out.println("enter nth number");
	    n=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
