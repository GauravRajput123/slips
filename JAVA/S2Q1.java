import java.io.*;
import java.util.Scanner;
class S2Q1
{
    public static void main(String a[])
    {
        String fnm,lnm;
        float w,h,b;
        fnm=a[0];
        lnm=a[1];
        w=Float.parseFloat(a[2]);
        h=Float.parseFloat(a[3]);
        
        b=w/(h*h);
        
        System.out.println(fnm+" "+lnm+",  your BMI : "+b);
        if(b<18.5)
        {
            System.out.println("Underweight");
        }
        else if(w>=18.5 && w<25)
        {
            System.out.println("Normal");
        }
        else if(w>=25 && w<30)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }
    }
}