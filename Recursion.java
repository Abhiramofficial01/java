package test;
import java.util.*;
public class Recursion 
{
	static int fun(int a)
	{
		if(a>0)
		{
			 fun(a-1);
			System.out.println(a);
		}
		return 0;
		
	}
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the number ");
		int b=S.nextInt();
		System.out.println(fun(b));
	}
}
