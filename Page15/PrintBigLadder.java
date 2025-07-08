// Print the below pattern below

// Given m and n integer input, where m tab separated stars are printed in the first line, and in total there are n lines.

// Eg. for m=7,n=13 the output is written under.

// Recognise the pattern and print the final output.

package Page15;

import java.util.Scanner;

public class PrintBigLadder {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    for(int i =1; i<=n; i++){
      for(int j = 1; j<=m; j++){
        if(j == 1 || j == m || i%3 == 1){
          System.out.print("*\t");
        }else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 4
// 10
// *       *       *       *
// *                       *
// *                       *
// *       *       *       *
// *                       *
// *                       *
// *       *       *       *
// *                       *
// *                       *
// *       *       *       *
