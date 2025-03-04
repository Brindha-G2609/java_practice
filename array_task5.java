import java.util.Scanner;

class array_task5
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter size");
		int size= scn.nextInt();
		char[] c1= new char[size];
		System.out.println("Enter the values");
		for(int i=0;i<c1.length;i++)
		{
		    c1[i]= scn.next().charAt(0);
		}

		
		System.out.println("---result---");
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>='a'&& c1[i]<='z')
		    System.out.println(c1[i]);
		    
		}
	
	}
	
}