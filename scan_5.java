//wap to find the area of rectangle ( formula= length* breadth)
import java.util.Scanner;

class scan_5
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" enter length:");
		float length = scn.nextFloat();
		System.out.println(" enter breadth:");
		float breadth = scn.nextFloat();
		System.out.println("---area of rectangle---");
		float area = length*breadth;
		System.out.println("length           :"+length);
		System.out.println("breadth          :"+breadth);
		System.out.println("area of rectangle:"+area);
		
			
		
	}
}