import java.util.Scanner;  
class Account
{  
    private int accno;  
    private String name;  
     
    
    //method to open new account
    Account(){}
    
    Account(int acno,String cname) 
    {  
        this.accno=acno;
        this.name=cname;
     } 
        /*System.out.print("Enter Account No: ");  
        accno = sc.next();  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong(); */
    void display()
 {

   System.out.println("Account number  : "+accno);
   System.out.println("Customer Name : "+name);

 }
}

class SavingAc extends Account
{
    int savingbal, minbal;
    SavingAc(){}
    SavingAc(int acno,String nm,int sav,int min)
    {
        super(acno,nm);
        this.savingbal=sav;
        this.minbal=min;
    }
    void displayAc()
 {
   super.display();
   System.out.println("Saving Ammount  : "+savingbal);
   System.out.println("Minimum Balence : "+minbal);

 }
}

class AccountDetail extends SavingAc
{
    int  deposit, withdraw;
    AccountDetail(){}
    AccountDetail(int acno,String nm,int sav,int min, int dep, int withd)
    {
    super(acno,nm,sav,min);
     this.deposit=dep;
        this.withdraw=withd;
    }
    void displayDetails()
 {
   super.displayAc();
   System.out.println("Deposit Ammount  : "+deposit);
   System.out.println("Withdraw Amount : "+withdraw);
 }
}

class S15Q2 extends AccountDetail
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter Account No: ");  
        int accno = sc.nextInt();  
        System.out.print("Enter Account name: ");  
        String acnm = sc.next();  
        System.out.print("Enter Saving Balence: ");  
        int sbal = sc.nextInt();  
        System.out.print("Enter minimum Balance: ");  
        int minbal = sc.nextInt(); 
        System.out.print("Enter Amount to deposit ");  
        int dep = sc.nextInt();
         System.out.print("Enter Amount to Withdraw ");  
        int wit= sc.nextInt();
        
        System.out.print("\nAccount Details are : \n "); 
        AccountDetail ac=new AccountDetail(accno,acnm,sbal,minbal,dep,wit);
        ac.displayDetails();
    }
}