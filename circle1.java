package test;
import java.util.*;
class circle
{
	 public double radius;
	 public double area()
	 {
		 return Math.PI*radius*radius;
	 }
	 public double perimeter()
	 {
		 return 2*Math.PI*radius;
	 }
	 public double circumference()
	 {
		 return perimeter();
	 }
}
public class circle1 
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the radius ");
		
		circle c1=new circle();
		 c1.radius=S.nextInt();
		System.out.println("Area ="+c1.area());
		System.out.println("perimeter= "+c1.perimeter());
		System.out.println("Circumference="+c1.circumference());
	}
}
