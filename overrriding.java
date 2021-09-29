package test;
class Super
{
	public void display()
	{
	  System.out.println("Super class display ");
	}
}
class sub extends Super
{
	
	public void display()
	{
		System.out.println("Sub class display ");
	}
}
public class overrriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Super S=new Super();
         S.display();
         sub s=new sub();
         s.display();
         
	}

}
