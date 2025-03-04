class for_eg5
{
	public static void main(String[] args)
	{
		int num=6,sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
			sum+=i;	
			}
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		if(num==sum)
		{			
		System.out.println("this number is a perfect number!!!");
		}
		else
		{			
		System.out.println("this number is not a perfect number!!!");
		}
	}
}