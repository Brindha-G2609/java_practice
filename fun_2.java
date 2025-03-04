class fun_2
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		byte a=4;
		byte b=5;
		boolean c= true;
		boolean d= false;
		print(a,b,c,d);
		System.out.println("main ends");
		
		
	}
	
	public static void print(byte a, byte b,boolean c,boolean d)
	{
		System.out.println("i am print function");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}
}