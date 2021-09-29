package test;

public class update {
    static void update (int a[])
    {	a[0]=3;
    	a[1]=6;
    	a[2]=9;
    	a[3]=12;
    	a[4]=15;
    }
public static void main(String[] args)
{
	int a[]= {2,4,6,8,10};
	update(a);
	{
		System.out.print(a[4]);
	}
}
}
