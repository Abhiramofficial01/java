package test;
import java.util.*;
public class printdigits {
      public static void main(String[] args)
      {
    	  int r;
    	  int i=0;
    	  Scanner S=new Scanner(System.in);
          System.out.println("Enter any number ");
          int n=S.nextInt();
          int a[]=new int[100];
          while(n>0)
          {
        	  r=n%10;
        	  a[i]=r;
        	  i++;
        	  n=n/10;
        	  
          }
          
         for(int j=i-1;j>=0;j--)
         {
        	 System.out.println(a[j]);
         }
      }
}
