package test;
public class max {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
       int a[]= {2,5,6,2,1,1000};
       int maxi=a[0];
       for(int i=0;i<a.length;i++)
       {
//    	   if(a[i]>maxi)
//    	   {
//    		 maxi = a[i];
//    	   }
    	   
    	   maxi = Math.max(maxi,a[i]);
       }
       System.out.println(maxi);
    
	}

}
