// You will be given an input n and x as an integer input, and you have to print the numbers from n to x in different lines.

// Input Format

// For each test case, you will get

// n as an integer input in the first line,

// x as an integer input in the second line.

package Page8;
import java.util.Scanner;
public class PrintNtoX {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    for(int i = n; i >= x; i--){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 10
// 2
// 10
// 9 
// 8 
// 7 
// 6 
// 5
// 4
// 3
// 2
