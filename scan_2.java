//wap to display all the odd numbers btw 1 to n 
import java.util.Scanner;

class scan_2
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println(" enter the number:");
		int num = scn.nextInt();
		System.out.println("---odd numbers---");
		for(int i=1;i<=num;i++)
		{	
	    if(i%2!=0)
		System.out.println(i);
		}
		
		
		
		
		
	}
}