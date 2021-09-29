package test;

import java.util.Scanner;

public class insertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				int n,pos,x;
				Scanner S=new Scanner(System.in);
				System.out.println("Enter the number ");
				n=S.nextInt();
				int a[]=new int[n+1];
				System.out.println("Enter all the elements ");
				for(int i=0;i<n;i++)
				{
					a[i]=S.nextInt();
				}
				System.out.println("Enter the position of an element to insert ");
				pos=S.nextInt();
				System.out.println("Enter the element to insert ");
				x=S.nextInt();
				for(int i=(n-1);i>=(pos-1);i--)
				{
					a[i+1]=a[i];
				}
				a[pos-1]=x;
				System.out.println("After inserting ");
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.print(a[n]);
			}

	}


