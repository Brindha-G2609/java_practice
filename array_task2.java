import java.util.Scanner;

class array_task2
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter size");
		int size= scn.nextInt();
		int[] num= new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<num.length;i++)
		{
		    num[i]= scn.nextInt();
		}
		int count=0;
		System.out.println("---result---");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
		    count++;
		}
		System.out.println("count of even numbers:"+count);
		
	}
	
}