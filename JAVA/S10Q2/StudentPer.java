package S10Q2;

public class StudentPer
{
    public int s1,s2,s3,s4,s5,s6;
    public StudentPer(int m1,int m2,int m3,int m4,int m5,int m6)
    {s1=m1;
                  s2=m2;
                  s3=m3;
                          s4=m4;
                          s5=m5;
                                  s6=m6;
    }
    public void display()
     {
          System.out.println("-----MARKS-------");
         System.out.println("Sub 1     : "+s1);
          System.out.println("Sub 2     : "+s2);
          System.out.println("Sub 3     : "+s3);
          
         System.out.println("Sub 4     : "+s4);
          System.out.println("Sub 5     : "+s5);
          System.out.println("Sub 6     : "+s6);
          
          int per=(s1+s2+s3+s4+s5+s6);
          
          System.out.println("Percentage =    : "+(per/600)*100);
          
          
     }
    
         }