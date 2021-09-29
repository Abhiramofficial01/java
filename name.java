package test;
import java.util.*;
public class name
{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Scanner S=new Scanner(System.in);
		String name;
		System.out.println("May I know your name-");
		name=S.nextLine();
		if(name.equals("Manjunatha"))
		{
			System.out.println("Hi Appa "+name);
	    }		
		else if (name.equals("Krishnaveni"))
	    {
	    	System.out.println("Welcome Amma "+name);
	    }
		else if(name.equals("Naganarasimha"))
	    {
	    	System.out.println("Hi bro " +name);
	    }
	    else
	   {
		   System.out.println("Hi " +name);
	   }
	}
}
