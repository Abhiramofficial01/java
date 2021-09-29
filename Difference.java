package test;
import java.util.*;
public class Difference 
{
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
     Scanner S=new Scanner(System.in);
     int a,b,c;
     System.out.println("enter two numbers");
     a=S.nextInt();
     b=S.nextInt();
     c=a-b;
     if((c)%2==0)
       {
       System.out.println("Diff is even"+c);
       }
     else
     {
    	 System.out.println("Diff is odd "+c);
     }
	}
}