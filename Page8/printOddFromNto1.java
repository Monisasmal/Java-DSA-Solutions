// You will get an integer input n, and you have to print all the odd numbers from n to 1 such that each number should be printed in a separate line.

// Input Format

// For each test case, you will get an integer input n.

package Page8;
import java.util.Scanner;
public class printOddFromNto1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i >= 1; i--){
      if(i %2 != 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}

// O/P-->
// 30
// 29
// 27
// 25
// 23
// 21
// 19
// 17
// 15
// 13
// 11
// 9
// 7
// 5
// 3
// 1
