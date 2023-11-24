/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SY;

/**
 *
 * @author msg05
 */


public class SYMarks {
	int ctotal;
	int mtotal;
	int etotal;
	public SYMarks(){}
	public SYMarks(int c,int m,int e)
	{
	ctotal=c;
	mtotal=m;
	etotal=e;
	}
	
	public int sytotal()
	{
	return(ctotal+mtotal+etotal);
	}
	
	public void display()
	{
	System.out.println("Computer marks:"+ctotal);
	System.out.println("Mathematics marks:"+mtotal);
	System.out.println("Electronics marks:"+etotal);
	}

}
    

