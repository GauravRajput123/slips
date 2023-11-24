import java.util.Scanner;
public class S4Q1 
{
	public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number rows of the matrix");
            int m = sc.nextInt();
            System.out.println("Enter the number of columns of the matrix");
            int n = sc.nextInt();
  
            int first[][] = new int[m][n];
  
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    first[i][j] = sc.nextInt();
  
            System.out.println("Elements of the matrix are");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }	
	
            System.out.print("After changing the rows and columns of the said array:");
            
            int[][] newtwodm = new int[first[0].length][first.length];
            for (int i = 0; i < first.length; i++) 
            {
		for (int j = 0; j < first[0].length; j++) 
                {
                    newtwodm[j][i] = first[i][j];
                     System.out.print(newtwodm[i][j] + "  ");
                System.out.println();
                }
            }
        }       
}