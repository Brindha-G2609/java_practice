class fun_3
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		
		int x = print("hello","world");
		System.out.println("x= "+x);
		
		System.out.println("main ends");
		
		
	}
	
	public static int print(String a, String b)
	{
		System.out.println("i am print function");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		return 100;
		
	}
}