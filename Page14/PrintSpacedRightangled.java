// Take an integer input n and Print the pattern.

// Input Format

// A single line n take input from user.


package Page14;

import java.util.Scanner;

public class PrintSpacedRightangled {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=(n-i); j++){
        System.out.print(" " + " ");
      }
      for(int k = 1; k<=i; k++){
        System.out.print(k + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 5
//         1 
//       1 2 
//     1 2 3 
//   1 2 3 4 
// 1 2 3 4 5 
