// Take an Integer input n and Print the pattern given below.

// Input Format

// A single line n take input from user.

package Page14;
import java.util.Scanner;
public class PrintInvertedRightAngledTriangle {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i>=1; i--){
      for(int j = 1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/p-->
// 5
// *****
// **** 
// ***  
// **
// * 
