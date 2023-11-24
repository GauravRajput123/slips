import java.util.*;
abstract class Staff
{
      protected int cnt, id;
      String nm;
}

class S1Q2 extends Staff
{
    String dept;
    
    S1Q2() {}
      
    S1Q2(int eid,String name, String dpt)
      {
            id=eid;
            nm=name;
            dept=dpt;
            cnt++;
            System.out.println("object "+cnt+ " created ");
      }


      public String toString()
      {
            return " Id = "+id+"\nnm = "+nm+"\nDeartment = "+dept;
      }
     
      public static void main(String a[])
      {
            int n,i,id;
            String name, dept;
            System.out.println("How many objects you want to create ?");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            S1Q2 ob[]=new  S1Q2[n];
            for(i=0;i<n;i++)
            {
                  System.out.println("Enter ID ");
                  id=sc.nextInt();
                  System.out.println("Enter Name");
                  name=sc.next();
                  System.out.println("Enter Department ");
                  dept=sc.next();
                  ob[i] = new  S1Q2(id,name,dept);
            }

            System.out.println("Employee's details as follows: ");
            for(i=0;i<n;i++)
            {
                  System.out.println(ob[i]);
            }
      }
}