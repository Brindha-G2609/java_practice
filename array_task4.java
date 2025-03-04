import java.util.Scanner;

class array_task4
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
		double sum=0.0;
		
		System.out.println("---result---");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>13.2)
				sum+=num[i];
		    
		}
		
		System.out.println("sum="+sum);
	}
	
}