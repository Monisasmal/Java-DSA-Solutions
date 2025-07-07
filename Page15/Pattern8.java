// Take an integer input n and then print a hollow n by n square without the top.

// Print as given in the conditions below:

// In the first line there will a star , followed by n-2 spaces and then there will be a star again,

// Just like above, there will n-1 lines and then

// in the last line there will be n stars.

// Input Format

// For each test case, n will be given as an integer input.


package Page15;

import java.util.Scanner;

public class Pattern8 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =1; i<n-1; i++){
      System.out.print("*");
      for(int j = 1; j<=n-2; j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    for(int i =1; i<=n; i++){
      System.out.print("*");
    }
    sc.close();
  }
}

// O/P-->
// 7
// *     *
// *     *
// *     *
// *     *
// *     *
// *******
