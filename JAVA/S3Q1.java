import java.util.Scanner;
  
class S3Q1
{
    public static void main(String args[])
    {
        String temp;
        Scanner SC = new Scanner(System.in);
         
        System.out.print("How many City's Name you want to enter? ");
        int N= SC.nextInt();
        SC.nextLine(); //ignore next line character
         
        String names[] = new String[N];
             
        System.out.println("Enter names: ");
        for(int i=0; i<N; i++)
        {
            System.out.print("City name " + (i+1) +": ");
            names[i] = SC.nextLine();
        }
             
        //sorting strings 
         
        for(int i=0; i<5; i++)
        {
            for(int j=1; j<5; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         
         
        System.out.println("\nSorted Order: ");
        for(int i=0;i<N;i++)
        {
            System.out.println(names[i]);
        }
    }
}