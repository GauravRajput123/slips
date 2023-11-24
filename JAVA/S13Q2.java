import java.text.SimpleDateFormat;  
import java.util.Date;  
public class S13Q2
{  
public static void main(String[] args) {  
    Date dt = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate = formatter.format(dt);  
    System.out.println("Current date is: "+strDate);  
  
    formatter = new SimpleDateFormat("MM-dd-yyyy");  
    strDate = formatter.format(dt);  
    System.out.println("Current date is: "+strDate);  
    
    formatter = new SimpleDateFormat("EEEEEE MMMM dd yyyy");  
    strDate = formatter.format(dt);  
    System.out.println("Current date is: "+strDate);  
    
    formatter = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");  
    strDate = formatter.format(dt);  
    System.out.println("Current date and time is: "+strDate);  
    
    formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");  
    strDate = formatter.format(dt);  
    System.out.println("Current date and time is: "+strDate);  
    
    formatter = new SimpleDateFormat("hh:mm:ss");  
    strDate = formatter.format(dt);  
    System.out.println("Current time is: "+strDate);  
  
    formatter = new SimpleDateFormat("w");  
    strDate = formatter.format(dt);  
    System.out.println("Current week of year is: "+strDate);  
  
    formatter = new SimpleDateFormat("W");  
    strDate = formatter.format(dt);  
    System.out.println("Current week of the month is: "+strDate);  
  
    formatter = new SimpleDateFormat("D");  
    strDate = formatter.format(dt);  
    System.out.println("Current day of the year: "+strDate);  
}  
} 