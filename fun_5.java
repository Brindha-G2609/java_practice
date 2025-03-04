class fun_5
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		
		double x = print(23, true,'s',"hello");
		System.out.println("x= "+x);
		
		System.out.println("main ends");
		
		
	}
	
	public static double print(int a, boolean b, char c, String d)
	{
		System.out.println("i am print function");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	    System.out.println("c = "+c);
		System.out.println("d = "+d);
		return 234.456;
		
	}
}