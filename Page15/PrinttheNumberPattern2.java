// Take an Integer input n and k and Print the Pattern below.

// K here Denotes the multiples of k.

// Input Format

// First line n take input from user.

// Second line k take input from user.

package Page15;

import java.util.Scanner;

public class PrinttheNumberPattern2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<= (n-i); j++){
        System.out.print("   ");
      }for(int j =0; j<i; j++){
        int result = k*(j+1);
        System.out.print(result + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 7
// 7
//                   7 
//                7 14
//             7 14 21
//          7 14 21 28
//       7 14 21 28 35
//    7 14 21 28 35 42
// 7 14 21 28 35 42 49 
