// Print the below pattern using nested for and while loop

// Note that : between two characters there is a tab.

// Eg. for m=7, the output is written under.

// Recognise the pattern and print the final output.


package Page15;

import java.util.Scanner;

public class PrintVPattern {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int row = (n+1)/2;
    for(int i =0; i<row; i++){
      for(int j =0; j<n; j++){
        if(j == i || j == n-i-1){
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
// 5
// *                               *
//         *               *
//                 *
