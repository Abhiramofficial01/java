package test;
import java.util.*;
public class maxiMethod {
      static int maxim(int a[])
      {
    	  int maxi=a[0];
    	  for(int i=0;i<a.length;i++)
    	  {
    		  if(a[i]>maxi)
    		  {
    			 maxi=a[i]; 
    		  }
    	  }
       return maxi;
      }
 public static void main(String[] args)
 {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter the elements in an array ");
	int n=S.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++)
	{
		A[i]=S.nextInt();
	}
System.out.println(maxim(A));
 }
}