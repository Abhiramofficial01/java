package test;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int r,sum=0,temp;
        int n=1231;
         temp=n;
        while(n>0)
        {
        	r=n%10;
        	n=n/10;
        	sum=(sum*10)+r;
        }
        if(temp==sum) {
        	System.out.println("Palindrome number ");
        }
        else
        {
        	System.out.println("Not palindrome number ");
        }
	    
	}
}
