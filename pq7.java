class pq7
{
public static void main(String[] args)
{
int num= 90;
System.out.println("num=" +num);
if(num%2==0)
{
	num+=20;
	System.out.println("num is even: increased");
}
else
{
	num-=20;
	System.out.println("num is odd:decreased");
}
System.out.println("num=" +num);
}
}