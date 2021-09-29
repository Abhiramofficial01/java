package test;
import java.util.*;

public class searchJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner S=new Scanner(System.in);
       int key;
       int a[]= {3,2,4,5,6,7,8,9};
       System.out.println("Enter the number = ");
       key=S.nextInt();
       for(int i = 0;i<a.length;i++)
       {
    	   if (a[i]==key)
    	   {
    		   System.out.print(i);
    		   System.exit(0);
    	   }
       }
       System.out.println("Not found ");
	}
}
