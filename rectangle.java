package test;
import java.util.*;
class rectangle1
{
	static public double length,breadth;
	static double area()
	{
		return length*breadth;
		
	}
	static double perimeter()
	{
		return 2*(length+breadth);
	}
	static boolean issquare()
	{
		if(length==breadth)
			return true;
		else
			return false;
	}
}

public class rectangle
{

	public static void main (String[] args) 
	
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter length and breadth ");
		rectangle1 r1=new rectangle1();
		r1.length=S.nextInt();
	    r1.breadth=S.nextInt();
	    System.out.println("Area= "+rectangle1.area());
	    System.out.println("Perimeter="+rectangle1.perimeter());
	    System.out.println(rectangle1.issquare());;
	}
	
	
	
	
}
