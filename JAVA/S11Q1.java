import java.util.Scanner;

interface volume
{
    double pi=3.142;
    double compute(double r,double h);
}

class Cylinder implements volume
{
    public double compute(double r,double h)
    {
        return pi*(r*r)*h;  
    }
}

class S11Q1
{  
    public static void main(String args[])  
    {  
        Cylinder c=new Cylinder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius= ");  
        double rad=sc.nextDouble();
        System.out.println("Enter Height= ");  
        double hgt=sc.nextDouble();
        System.out.println("Volume of the cylinder="+c.compute(rad, hgt));
     }  
}  