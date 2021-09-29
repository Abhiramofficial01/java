package test;
import java.util.*;
public class hcf {
static int gcd(int m,int n)
  {
	while(m!=n)
	 {
		 if(m>n)
			  m=m-n;
		 else
			  n=n-m;
	 }
	return m;
  }
public static void main(String[] args)
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the numbers ");
    int a=S.nextInt();
    int b=S.nextInt();
    System.out.print(gcd(a,b));
}
}