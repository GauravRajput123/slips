import Operation.*;
import java.util.Scanner;
class S20Q2
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number");
    int a=sc.nextInt();
    System.out.println("Enter Second number");
    int b=sc.nextInt();
    
    Addition obj=new Addition();
    obj.Add(a, b);
    obj.Substract(a, b);
    
    Maximum ob=new Maximum(a,b);

}
}

