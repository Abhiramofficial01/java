package test;
import java.util.*;

public class discountVararg 
{
	static double discount(double...p)
   {
		int sum=0;
		for(double i:p)
		sum+=i;
	   if(sum<250)
		   System.out.print("Discount is 10% = ");
	   if(sum==500)
		   System.out.print("Discount is 15% =");
	   if(sum>500)
		   System.out.print("Cooker is free = ");
	return sum;
   }
public static void main(String[] args)
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the prices=");
	int a=S.nextInt();
	int b=S.nextInt();
	int c=S.nextInt();
	int d=S.nextInt();
    System.out.println(discount(a,b,c,d));
  }
}