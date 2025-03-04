//wap to find the area of square ( formula=side * side)
import java.util.Scanner;

class scan_6
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" enter side:");
		float side = scn.nextFloat();
		System.out.println("---area of square---");
		float area = side*side;
		System.out.println("side           :"+side);
	
		System.out.println("area of square :"+area);
		
			
		
	}
}