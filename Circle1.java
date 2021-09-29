package test;
import java.util.*;
class Circle
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
class Cylinder extends Circle
{
	public double height;
	public double volume()
	{
		return area()*height;
				
	}
}
public class Circle1
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		Cylinder c=new Cylinder();
		System.out.println("Enter radius and height of the cylinder ");
		c.radius=S.nextDouble();
		c.height=S.nextDouble();
		System.out.println("Volume="+c.volume());
		System.out.println("Area="+c.area());
	}

}
