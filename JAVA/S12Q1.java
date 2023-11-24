
import java.util.Scanner;

class College
{
   int cno;
   String cname,cadr;
  
   College(int cn, String cnm, String cad)
  {
     cno=cn;
     cname=cnm;
    cadr=cad;
   }

  void displayCollege()
  {System.out.println("College number : "+cno);
   System.out.println("Name : "+cname);
    System.out.println("Address :  "+cadr);
    
   }
}

class Department extends College
{
  int dno;
  String dname;
  Department(int a, String b, String c,int dn, String dnm)
  {
   super(a,b,c);
    dno=dn;
    dname=dnm;
  }
void displayDept()
 {
   super.displayCollege();
   System.out.println("Department number : "+dno);
   System.out.println("Department number : "+dname);

 }

}

class S12Q1
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int cno, dno;
      String cnm,cadr,dnm;
      
      
      //System.out.println());
      System.out.println("Enter College Number");
      cno=sc.nextInt();
      System.out.println("Enter College Name");
      cnm=sc.next();
      System.out.println("Enter College Address");
      cadr=sc.next();
      System.out.println("Enter Department Number");
      dno=sc.nextInt();
      System.out.println("Enter Department Name");
      dnm=sc.next();
          
  
      
    Department e=new Department(cno,cnm,cadr,dno,dnm);
    System.out.println("\n\nDetails Are");
    e.displayDept();
   }
}