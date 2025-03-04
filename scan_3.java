//wap to print sum of all the odd numbers btw 1 to n 
import java.util.Scanner;

class scan_3
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		int sum=0;
		System.out.println(" enter the number:");
		int num = scn.nextInt();
		System.out.println("---sum of odd numbers---");
		for(int i=1;i<=num;i++)
		{	
	    if(i%2!=0)
		sum+=i;
		}
		
		System.out.println("sum="+sum);
		
		
		
	}
}