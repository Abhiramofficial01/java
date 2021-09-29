package test;
import java.util.*;
public class Marks 
{
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Scanner S=new Scanner(System.in);
		int p,c,m,avg;
			System.out.println("Enter your PCM marks");
			p=S.nextInt();
			c=S.nextInt();
			m=S.nextInt();
			avg=(int) ((p+c+m)/3.0);
			System.out.println("The average marks is "+avg);
		
			if(avg>=90)
			{
				System.out.println("Good ");
			}
			else
			{
				System.out.println("Better luck next time ");
				
			}
				
	
	}
	

	

}
