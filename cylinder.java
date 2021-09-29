package test;
class cylinder1
{
	private double radius;
	private double height;
	public double getRadius()
	{
		return radius;
		
	}
	public double getHeight()
	
	{
		return height;
	}
	void setHeight(double h) {
		// TODO Auto-generated method stub
		if(h>=0)
			height=h;
		else 
			height=0;
	}
	void setRadius(double r) {
		// TODO Auto-generated method stub
		if(r>=0)
			radius=r;
		else
			radius=0;
	}
		public double area()
		{
			return 2*Math.PI*getRadius()*(getRadius()+getHeight());
		}
}
public class cylinder {
    public static void main(String[] args)
    {
    	
    	cylinder1 c1=new cylinder1();
    	c1.setRadius(10.643);
    	c1.setHeight(10.792);
    	System.out.println("Surface area of cylinder ="+c1.area());
    	System.out.println("Radius ="+c1.getRadius());
    	System.out.println("Height = "+c1.getHeight());
    	
    }
}
