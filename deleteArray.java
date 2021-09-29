package test;
import java.util.*;
public class deleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,x,count=0;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the numbers in array ");
        n=S.nextInt();
        int a[]=new int[n+1];
        System.out.println("Enter all the elements ");
        for(int i=0;i<n;i++)
        {
        	a[i]=S.nextInt();
        }
        
        System.out.println("Enter the element to delete");
        x=S.nextInt();
        for(int i=0;i<n;i++)
        {
        	if(a[i]==x)
        	{
        		for(int j=i;j<(n-1);j++)
        		{
        			a[j]=a[j+1];
        		}
        	} 
        	count++;
        	break;
        } 
        if(count==0)
        {
        	System.out.print("Element not found ");
        }
        else
        {
        	System.out.print("Element deleted.. ");
        	System.out.print("Now the new array is : ");
        	for(int i=0;i<(n-1);i++)
        	{
        		System.out.print(a[i]+ " ");
        	}
        }
	}

}
