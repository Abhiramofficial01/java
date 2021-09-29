package test;
import java.util.*;
public class rotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the count of an array  ");
        int count=S.nextInt();
        System.out.println("Enter the number of rotations ");
        int rotation=S.nextInt();
        int orginala[]=new int[count];
        int rotateda[]=new int[count];
        for(int i=1;i<count;i++)
        {
        	System.out.println("enter element for position "+(i+1)+":");
        	int no=S.nextInt();
        	orginala[i]=no;
        	rotateda[(i-rotation+count)%count]=no;
        
        }
      System.out.println("Array : "+Arrays.toString(orginala));
      System.out.println("Array : "+Arrays.toString(rotateda));
	}
}