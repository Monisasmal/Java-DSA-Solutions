// You will be given two integers N and K as an integer input.

// You have to print the series N, N-K, N-2K where each number should be printed in a separate line and you have to print till the time the printed integer is greater than or equal to zero.

// Kindly take a look at the sample test cases for a better understanding.

// Input Format

// For each test case,

// N will be given as an integer input in the first line,

// K will be given as an integer input in the second line.

package Page9;
import java.util.Scanner;
public class PrintN {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    for(int i = n; i>=0; i-=k){
      System.out.println(i);
    }
    sc.close();
  }
}


// O/P-->
// 30
// 4
// 30
// 26
// 22
// 18
// 14
// 10
// 6
// 2