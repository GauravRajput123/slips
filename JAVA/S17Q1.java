import java.io.*;
class Customer
{
 String cname;
 int pno;
 Customer(int p,String s)
 {
 pno=p;
 cname=s;
 }
}

class Depositor extends Customer
{
 int acno,bal;
 Depositor(int p,String s,int a,int b)
 {
 super(p,s);
 acno=a;
 bal=b;
 }
}

class Borrower extends Depositor
{
 int loanNo,loanAmt;
 Borrower(int p,String s,int a,int b,int ln,int la)
 {
 super(p,s,a,b);
 loanNo=ln;
 loanAmt=la;
 }
 void putData()
 {
 System.out.println(pno+"\t"+cname+"\t"+acno +"\t"+bal+"\t"+loanNo+"\t"+loanAmt);
 }
 static void Depo(Borrower b[],int n)
 {
 for(int i=0;i<n;i++)
 {
 if(b[i].bal>100)
{
System.out.println(b[i].cname);
 }
 }
 }
 static void Borrow(Borrower b[],int n)
 {
 for(int i=0;i<n;i++)
 {
 if(b[i].loanAmt>100)
{
System.out.println(b[i].cname);
 }
 }
 }
}
class S17Q1
{
 public static void main(String args[]) throws Exception
 {
 int n;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the No Of Records");
 n=Integer.parseInt(br.readLine());
 Borrower b[]=new Borrower[n];
 for(int i=0;i<n;i++)
 {
 System.out.println("Enter the Ph_No");
 int p=Integer.parseInt(br.readLine());
 System.out.println("Enter the Customer Name");
 String cn=br.readLine();
 System.out.println("Enter the Ac_No");
 int an=Integer.parseInt(br.readLine());
 System.out.println("Enter the Amt For Deposite");
 int bal=Integer.parseInt(br.readLine());
 System.out.println("Enter the Loan_No");
 int loanNo=Integer.parseInt(br.readLine());
 System.out.println("Enter the loanAmt");
 int loanAmt=Integer.parseInt(br.readLine());
 b[i]=new Borrower(p,cn,an,bal,loanNo,loanAmt);
 }
 System.out.println("List Of Depositor");
 Borrower.Depo(b,n);
 System.out.println("List Of Borrower");
 Borrower.Borrow(b,n);

 }
}