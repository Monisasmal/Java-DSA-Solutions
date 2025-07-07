// Take n as an integer input, then

// print n tab separated stars in the first line,

// then in the second line print a star, then n-2 tabs, then print a star.

// then print n tab separated stars in the third line.

// then in the fourth line print a star, then n-2 tabs, then print a star .

package Page15;

import java.util.Scanner;

public class Pattern9 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n; j++){
        if(i%2 != 0 || j == 1 || j == n){
System.out.print("* ");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 5
// * * * * * 
// *    *
// * * * * *
// *    *
// * * * * *
