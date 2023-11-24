package S10Q2;
public class StudentInfo
{
     public int r_no;
     public String name;
     
     
     public StudentInfo(int roll, String nm)
     {
          r_no = roll;
          name = nm;
          
     }
     public void display()
     {
          System.out.println("Roll_no : "+r_no);
          System.out.println("Name    : "+name);
              
          
     }
}