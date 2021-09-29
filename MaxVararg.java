package test;

public class MaxVararg 
{
	static int max1(int...a)
	{
		if(a.length==0)
			return Integer.MIN_VALUE;
		int m=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>m)m=a[i];
			return m;
		
	}
	public static void main(String[] args)
	{
		System.out.println(max1());
		System.out.println(max1(10,15));
		System.out.println(max1(10,15,20));
		System.out.println(max1(10,15,20,100,2000,4000));
	}
}
