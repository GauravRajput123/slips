
import java.util.Scanner;

interface Square
{
public void print(int num);
}
public class S16Q1
{
public static void main(String[] a)
{
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter number to find Square");
    int n=sc.nextInt();
    
Square p = n1 -> System.out.println("Square of "+n+" is: "+ n*n);
p.print(n);
}
}