//wap to find the area of circle ( formula=3.14*radius * radius)
import java.util.Scanner;

class scan_7
{
	
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println(" enter radius:");
		float radius = scn.nextFloat();
		System.out.println("---area of circle---");
		double area =3.14 * radius * radius;
		System.out.println("radius          :"+radius);
	
		System.out.println("area of circle  :"+area);
		
			
		
	}
}