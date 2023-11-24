import java.util.Scanner;
import SY.*;
import TY.*;

public class S14Q2 
{
	int roll;
	String name;
	SYMarks o1;
	TYMarks o2;
	
	S14Q2(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ctotal:");
		int c=sc.nextInt();
		
		System.out.println("Enter mtotal:");
		int m=sc.nextInt();
		
		System.out.println("Enter etotal:");
		int e=sc.nextInt();
		
		o1=new SYMarks(c,m,e);
		
		System.out.println("Enter theory marks:");
		int t=sc.nextInt();
		System.out.println("Enter practical marks:");
		int p=sc.nextInt();
		
		o2=new TYMarks(t,p);
	}
	
	void grade()
	{
		int gt=o1.sytotal()+o2.tytotal();
		double per=gt/5;
		if(per>=75)
			System.out.println("Distinction!!!!");
		else
			if(per>=60 && per<75)
				System.out.println("First Class.");
			else
				if(per>=50 && per<60)
					System.out.println("Second Class.");
				else
					System.out.println("Fail!!Study Hard!");
                
                
	}
	
	public static void main(String a[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter How Many Students : ");
		int n=sc1.nextInt();
		
		S14Q2 s[]=new S14Q2[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter roll:");
			int r=sc1.nextInt();
			System.out.println("Enter Name:");
			String nm=sc1.next();
			s[i]=new S14Q2(r,nm);
		}
                System.out.println("\nDetails Are ==> \n");
		for(int i=0;i<n;i++)
		{
			s[i].o1.display();
			s[i].o2.display();
			s[i].grade();
		}
	}
}