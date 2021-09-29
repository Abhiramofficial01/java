package test;
import java.util.*;
public class arraysum {

	public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);
		// TODO Auto-generated method stub
         int Sum=0,i;
         int a[]={2,4,6,8,10};
         for(i=0;i<a.length;i++)
         {
        	 Sum=Sum+a[i];
         }
         
        System.out.println("The sum is "+Sum);
	}

}
