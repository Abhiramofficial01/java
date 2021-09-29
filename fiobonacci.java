package test;
class fiobonacci
{
	
	static	int n1=0,n2=1,n3=0;
		
	static void printfib(int count)
	{
			if(count>0)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.println(""+n3);
				printfib(count-1);
			}
		
			
		}

public static void main(String[] args)
{
	int count=10;
	System.out.println(n1+" ");
	printfib(count-2);
}
}



    	
