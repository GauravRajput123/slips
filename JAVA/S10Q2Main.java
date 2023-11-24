import S10Q2.*;
import java.util.Scanner;
class S10Q2Main
{
     public static void main(String[] args)
     {
          String nm;
          int roll;
          int m1,m2,m3,m4,m5,m6;
          
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Roll no:= ");
          roll = sc.nextInt();
          System.out.print("Enter Name:= ");
          nm = sc.next();
          System.out.print("Enter marks of 6 subjects:= ");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          m4 = sc.nextInt();
          m5 = sc.nextInt();
          m6 = sc.nextInt();
          StudentInfo si = new StudentInfo(roll,nm);
          si.display();
          StudentPer sp = new StudentPer( m1,m2,m3,m4,m5,m6);
          sp.display();
     }
}