package test;
import java.util.*;
public class guessnumber {

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub
         Scanner S=new Scanner(System.in);
          int myNumber=(int)(Math.random()*(100));
          int userNumber=0;
     do{
    	System.out.println("Enter the number ");
    	userNumber=S.nextInt();
    	if(userNumber==myNumber)
    	{
    		System.out.println("HURREY...CORRECT ");
    		break;
    	}
    	else if(userNumber>myNumber)
    	{
    		System.out.println("Your number is too large ");
    	}
    	else
    	{
    		System.out.println("Your number is too small ");
    	}
      }while(userNumber>=0);
     System.out.println("My number was also ");
     System.out.println(myNumber);
}
}
