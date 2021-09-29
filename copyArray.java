package test;
import java.util.*;
public class copyArray {

	private static final int j = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner S=new Scanner(System.in);
       int n,size;
       System.out.println("enter the elemens  ");
       n=S.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=S.nextInt();
       }
       System.out.println("Enter another array to store ");
       size=S.nextInt();
       int b[]=new int[size];
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a.length;j++) {
    		   b[j]=a[i];
    	   }
       }
       
       System.out.print(b[j]+" ");
	}

}
