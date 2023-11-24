/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TY;


public class TYMarks {
	
	int theory;
	int practical;
	
	public TYMarks(){}
	
	public TYMarks(int t,int p)
	{
	theory=t;
	practical=p;
	}
	
	public int tytotal()
	{
	return(theory+practical);
	}
	
	public void display()
	{
	System.out.println("Theory marks:"+theory);
	System.out.println("Practical marks:"+practical);
	}
}