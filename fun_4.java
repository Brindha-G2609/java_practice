class fun_4
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		
		String x = print(123.455,23,'b');
		System.out.println("x= "+x);
		
		System.out.println("main ends");
		
		
	}
	
	public static String print(double a, int b, char c)
	{
		System.out.println("i am print function");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	    System.out.println("c = "+c);
		return "hello";
		
	}
}