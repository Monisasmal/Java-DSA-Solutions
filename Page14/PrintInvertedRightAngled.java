// Take an integer input n and Prin the pattern.

// Input Format

// A single line n take input from user.

package Page14;

import java.util.Scanner;

public class PrintInvertedRightAngled {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = n; j>=i; j--){
       System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 5

// 5 4 3 2 1 
// 5 4 3 2   
// 5 4 3     
// 5 4       
// 5    
