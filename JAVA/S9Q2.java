import java.util.Scanner;  
class S9Q2 implements Cloneable   
{  
	static int cnt=0;
	int id;  
	String name;  
	double cost;  
	int qty;
	//Product class constructor   
	S9Q2(){}
	public S9Q2 (int pid, String pname, double pcost, int pqty)  
	{  
		cnt++;
		this.id = pid;  
		this.name = pname;  
		this.cost = pcost;  
		this.qty=pqty;
	}  
	//method that prints the detail on the console  
	public void display()   
	{  
		System.out.println("Product ID: "+id);  
		System.out.println("Product Name: "+name);  
		System.out.println("Product Cost: "+cost);  
		System.out.println("Product Cost: "+qty+"\n");
	}  
	
	static void count()
	{
		System.out.println(" object "+cnt+" is created");
	}
	
	public static void main (String args[]) throws CloneNotSupportedException   
	{  
		Scanner sc = new Scanner(System.in);  
		System.out.println("How many objects you want to create ?");
		int n=sc.nextInt();
		ASG3Bb obj1[]=new ASG3Bb[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter  ID: ");  
			int pid = sc.nextInt();  
			System.out.print("Enter  Name: ");  
			String pname = sc.next();  
			System.out.print("Enter  Cost: ");  
			double pcost = sc.nextDouble();  
			System.out.print("Enter  Quatnity: ");  
			int pqty = sc.nextInt(); 
			obj1[i] = new ASG3Bb(pid, pname, pcost, pqty); 
			ASG3Bb.count();
		}  
		System.out.println("-------Product Detail--------");  
		
		for(int i=0; i<n; i++)
		{	
			//cloning the object of the Product class using the clone() method  
			ASG3Bb obj2 = (ASG3Bb) obj1[i].clone();  
			//invoking the method to print detail  
			obj2.display();  
		}
	}
}