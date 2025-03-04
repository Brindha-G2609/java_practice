class task_while8
{
	//08
	public static void main(String[] args)
	{
		int i=151,sum=0;
		while(i<=251)
		{ 
            if(i%2!=0)
			sum+=i;
		    
		    i++;
		}
		 System.out.println("sum of all odd numbers:"+sum);
	}
}