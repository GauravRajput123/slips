import java.io.IOException;
import java.util.Scanner;
 
class Continent
{
	String con;
	Scanner sc= new Scanner(System.in); 
 
	void getContinent() 
	{
		System.out.println("Enter Continent Name:  "); 
		con = sc.next();    
	}
}
 
class Country extends Continent
{
	String cnt;
 
	void getCountry() 
	{
		System.out.println("Enter Country Name:  ");
		cnt = sc.next();     
	} 
}
 
class State extends Country
{
	String st;
	void getState() throws IOException
	{
		System.out.println("Enter State Name:  ");
		st =sc.next(); 
	}
}

class S5Q1
{
	public static void main( String asg[])throws IOException
	{
		State s = new State();
		s.getContinent();
		s.getCountry();
		s.getState();
 
		System.out.println("\nState '"+s.st+"' belongs from country '"+s.cnt+"' of '"+s.con+"' Continent" ); 
	}
}