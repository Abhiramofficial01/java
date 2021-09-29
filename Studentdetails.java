package test;
import java.util.*;
class student
{
	static public int m1,m2,m3;
	static public int roll;
	static public String name;
	static public String course;
	
	static public int total()
	{
		return m1+m2+m3;
	}
	static public float average()
	{
		return (float)total()/3;
	}
	static char grade()
	{
		if(average()>=80)
			return 'A';
		else
			return 'B';
	}
	static String name()
	{
		return "Name="+name+"\n"+ "roll number="+roll+"\n"+"Course="+course+"\n";
	}
}
public class Studentdetails 
 
{
    public static void main(String[] args)
    {
    	Scanner S=new Scanner(System.in);
    	student s1=new student();
    	System.out.println("Enter the Student Name ");
    	s1.name=S.next();
    	System.out.println("Enter the roll number and course ");
    	s1.roll=S.nextInt();
    	s1.course=S.next();
    	System.out.println("Enter m1,m2 and m3 ");
    	s1.m1=S.nextInt();
    	s1.m2=S.nextInt();
    	s1.m3=S.nextInt();
    	System.out.println("Details"+"\n"+s1.name());
    	System.out.println("Total= "+s1.total());
    	System.out.println("Average="+s1.average());
    	System.out.println("Grade="+s1.grade());
    }
}
