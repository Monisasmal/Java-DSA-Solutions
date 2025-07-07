// Take m and n as an integer input, then print a hollow m by n star rectangle.

// Then print hollow star rectangle which has m stars in the first line and m stars in the nth line.

// There rectangle should have n lines

// and in every line in between should have only first star and then the mth star.

// Input Format

// For each test case, m will be given in the first line.

// And n will be given in the second line.


package Page15;
import java.util.Scanner;
public class Pattern7 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    for(int i = 1; i<=m; i++){
      System.out.print("*");
    }
    System.out.println();
    for(int i = 1; i<=n-2; i++){
      System.out.print("*");
      for(int j = 1; j<= m-2; j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    for(int i = 1; i<=m; i++){
      System.out.print("*");
    }
    sc.close();
  }
}

// O/P-->
// 4
// 5
// ****
// *  *
// *  *
// *  *
// ****
