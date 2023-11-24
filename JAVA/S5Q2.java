import java.util.Arrays;
import java.util.Scanner;

public class S5Q2 {

  // main method
  public static void main(String[] args) {

    // Scanner class object
    Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number rows of the first matrix");
            int f1 = sc.nextInt();
            System.out.println("Enter the number of columns of the First matrix");
            int f2 = sc.nextInt();
  
            int first[][] = new int[f1][f2];
  
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < f1; i++)
                for (int j = 0; j < f2; j++)
                    first[i][j] = sc.nextInt();
            
            System.out.println("Enter the number rows of the second matrix");
            int s1 = sc.nextInt();
            System.out.println("Enter the number of columns of the second matrix");
            int s2 = sc.nextInt();
  
            int second[][] = new int[s1][s2];
  
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < s1; i++)
                for (int j = 0; j < s2; j++)
                    second[i][j] = sc.nextInt();
  
            System.out.println("Elements of the first matrix are");
            for (int i = 0; i < f1; i++) 
            {
                for (int j = 0; j < f2; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }
            
            
            System.out.println("Elements of the second matrix are");
            for (int i = 0; i < s1; i++) 
            {
                for (int j = 0; j < s2; j++)
                    System.out.print(second[i][j] + "  ");
                System.out.println();
            }
            
            
            int c[][] = new int[f1][f2];

    // display both matrix
    System.out.println("A = " + Arrays.deepToString(first));
    System.out.println("B = " + Arrays.deepToString(second));

    // variable to take choice
    int choice;

    // menu-driven
    do {
      // menu to choose the operation
      System.out.println("\nChoose the matrix operation,");
      System.out.println("----------------------------");
      System.out.println("1. Addition");
     
      System.out.println("2. Multiplication");
     
      System.out.println("3. Exit");
      System.out.println("----------------------------");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

      switch (choice) {
      case 1:
        c = add(first, second);
        System.out.println("Sum of matrix: ");
        System.out.println(Arrays.deepToString(c));
        break;
      case 2:
        c = multiply(first, second);
        System.out.println("Multiplication of matrix: ");
        System.out.println(Arrays.deepToString(c));
        break;
      case 3:
        System.out.println("Thank You.");
        return;
      default:
        System.out.println("Invalid input.");
        System.out.println("Please enter the correct input.");
      }
    } while (true);
  }

  // method to perform matrix addition and
  // return resultant matrix
  public static int[][] add(int[][] a, int[][] b) {

    // calculate row and column size of anyone matrix
    int row = a.length;
    int column = a[0].length;

    // declare a matrix to store resultant value
    int sum[][] = new int[row][column];

    // calculate sum of two matrices
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }

    // return resultant matrix
    return sum;
  }

  // method to perform matrix multiplication and
  // return resultant matrix
  // passed matrices can be square or non-square matrix
  public static int[][] multiply(int[][] a, int[][] b) {

    // find row size of first matrix
    int row = a.length;
    // find column size of second matrix
    int column = b[0].length;

    // declare new matrix to store result
    int product[][] = new int[row][column];

    // find product of both matrices
    // outer loop up to row of A
    for (int i = 0; i < row; i++) {
      // inner-1 loop utp0 column of B
      for (int j = 0; j < column; j++) {
        // assign 0 to the current element
        product[i][j] = 0;

        // inner-2 loop up to A[0].length
        for (int k = 0; k < a[0].length; k++) {
          product[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return product;
  }

}
