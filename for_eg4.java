class for_eg4
{
	public static void main(String[] args)
	{
		int num=11,count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			count++;	
			}
		}
		System.out.println("num="+num);
		System.out.println("count="+count);
		if(count==2)
		{			
		System.out.println("this number is prime!!!");
		}
		else
		{			
		System.out.println("this number is not a prime!!!");
		}
	}
}