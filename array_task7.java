import java.util.Scanner;

class array_task7
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter size");
		int size= scn.nextInt();
		String[] s1= new String[size];
		System.out.println("Enter the values");
		for(int i=0;i<s1.length;i++)
		{
		    s1[i]= scn.next();
		}

		
		System.out.println("---result---");
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].endsWith("i"))
		    System.out.println(s1[i]);
		    
		}
	
	}
	
}