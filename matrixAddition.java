package test;

public class matrixAddition 
{
	public static void main(String[] args) 
	{		// TODO Auto-generated method stub
	   int rows=3,coloumns=3;
      int a[][]={{1,3,4},{2,4,3},{3,4,5}};
      int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
      int c[][]= new int[3][3];
      int i,j;
       for(i=0;i<rows;i++)
      {
    	for(j=0;j<coloumns;j++) 
    	{
    		c[i][j]=a[i][j]+b[i][j];
    	}
      } 
       System.out.println("Sum of 2 matrices is: ");
        for(i=0;i<rows;i++)
        {
        	for(j=0;j<coloumns;j++)
        	{
        		System.out.print(c[i][j] + " ");
          	}
        
           System.out.println();
        }
      }
	}
		  	


