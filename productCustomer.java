package test;
class product
{
   private static final String Maagi = null;
static public int itemno;
   static public String name;
   static public float price;
   static public int qty;
	static public int getItemno()
	{
		return itemno;
	}
	static public String getName()
	{
		return name;
	}
	static public float setprice(int i)
	{
		if(price>0)
		   return price;
		else 
			return 0;
	}
	static public int setqty(int i)
	{
		if(qty>0)
			return qty;
		else
			return 0;
	}
	public product(int itemno)
	{
		itemno=1;
			
	}
	public product(int itemno,String name)
	{
		if(name==Maagi)
			itemno=1;
		else
			itemno=2;
	}
	
	public product(float price,int qty)
	{
		if(name==Maagi)
			price=20;
		else 
			price=30;
		if(price==20)
			qty=1;
		else
			qty=2;
	}
	public product(int itemno,String name,float price,int qty)
	{
		if(name==Maagi)
			itemno=1;
		else
			itemno=2;
		if(name==Maagi)
			price=20;
		else 
			price=30;
		if(price==20)
			qty=1;
		else
			qty=2;
	}
}
public class productCustomer {
    private static final String Maagi = null;

	public static void main(String[] args)
    {
    	product p1=new product(1,Maagi);
    	p1.setprice(20);
    	p1.setqty(30); 
    }	
}
