// Print the below pattern.

// Take m as an integer input, where m tab separated stars are printed in the first line. Then you have to print the pattern below.

package Page14;

import java.util.Scanner;

public class PrintInvertedTriangle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sp = 1;
    while(n >= 1){
      for(int i = 1; i<sp; i++){
        System.out.print(" ");
      }for(int j = 1; j<=n; j++){
        System.out.print("* ");
      }
      System.out.println();
      n -= 2;
      sp++;
    }
    sc.close();
  }
}

// O/P-->
// 7
// * * * * * * * 
//  * * * * *    
//   * * *       
//    * 
