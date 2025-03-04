//wap to display all the numbers btw 1 to n in the reverse order
import java.util.Scanner;

class scan_1
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println(" enter the number:");
		int num = scn.nextInt();
		System.out.println("reverse order");
		for(int i=num;i>=1;i--)
		{	
		System.out.println(i);
		}
		
		
		
		
		
	}
}