// Take n as an integer input. Then take n digits as integer inputs and form a number from it and print that number as an integer output.

// Input Format

// For each test case, n will be given as an integer input in the first line,

// then n digits will be given as integer inputs in each line.


package Page17;
import java.util.Scanner;
public class PrintTheFinalNumberxyzw {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 0;
    for(int i = 1; i<=n; i++){
      int digit = sc.nextInt();
      num = num * 10 + digit;
    }
    System.out.println(num);
    sc.close();
  }
}

// O/P-->
// 2
// 7
// 9
// 79
