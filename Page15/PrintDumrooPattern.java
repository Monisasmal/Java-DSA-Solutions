// Print the below pattern

// Given m as integer input, where m tab separated stars are printed in the first line,

// Eg. for m=7, the output is written under.

// Recognise the pattern and print the final output.

package Page15;

import java.util.Scanner;

public class PrintDumrooPattern {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int str = m;
    int spc = 0;
    for(int i = 0; i<m; i++){
      for(int j = 0; j<spc; j++){
       System.out.print(" ");
      }
      for(int k = 0; k<str; k++){
        System.out.print("*" + " ");
      }
      if(i < m/2){
        str -= 2;
        spc++;
      }else{
        str += 2;
        spc--;
      }
      System.out.println();
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
//   * * *
//  * * * * *
// * * * * * * *
