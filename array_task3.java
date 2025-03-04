import java.util.Scanner;

class array_task3
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter size");
		int size= scn.nextInt();
		double[] num= new double[size];
		System.out.println("Enter the values");
		for(int i=0;i<num.length;i++)
		{
		    num[i]= scn.nextDouble();
		}
		
		System.out.println("---result---");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<34.1)
		    System.out.println(num[i]);
		}
		
		
	}
	
}