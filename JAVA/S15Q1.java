import java.io.*;  

class S15Q1 
{  
 public static void main(String a[]) throws Exception 
 {  
   
  String first,second;
  first=a[0];
  second=a[1];
 
  FileReader fin = new FileReader(first);  
  FileWriter fout = new FileWriter(second, true);  
  int c;  
  while ((c = fin.read()) != -1) {  
   fout.write(c);  
  }  
  System.out.println("Copy finish...");  
  fin.close();  
  fout.close();  
 }  
}   