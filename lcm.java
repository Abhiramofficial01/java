package test;
import java.util.*;
public class lcm 
{
	static int gcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
				 a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	public static void main(String[] args)
	{
		Scanner	S=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int m=S.nextInt();
		int n=S.nextInt();
		System.out.println("HCF is "+gcd(m,n));
		int lcm=(m*n)/gcd(m,n);
		System.out.println("LCM is "+lcm);
	}
	

}
