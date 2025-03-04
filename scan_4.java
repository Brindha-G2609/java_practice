//wap to print multiple of 9 between 1 to n
import java.util.Scanner;

class scan_4
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" enter the number:");
		int num = scn.nextInt();
		System.out.println("---multiple of 9---");
		for(int i=1;i<=num;i++)
		{	
	    if(i%9==0)
		System.out.println(i);
		}
			
		
	}
}