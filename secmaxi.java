package test;

public class secmaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,1,1};
       int max1=a[0];
       int max2=a[0];
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]>max1)
    	   {
    		   max2=max1;
    		   max1=a[i];
    	   }
         else
         {
        	 max2=a[i];
         }
       }   
      System.out.println("the seccond max num is " +max2); 
       
	}

}
