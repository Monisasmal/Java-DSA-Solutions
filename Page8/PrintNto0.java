// You will be given an integer input n and you have to print the integers from n to 0 in different lines.
// Input Format
// For each test case, you will get an input n of integer data-type.

package Page8;
import java.util.Scanner;
public class PrintNto0 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i>= 0; i--){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 10
// 10
// 9 
// 8 
// 7 
// 6 
// 5 
// 4
// 3
// 2
// 1
// 0
