// Take n as an integer input, you have to pick the last 3 digits of the number of and put them in the starting.

// eg. 1234567 is given, then this number should transform to 5671234.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// A 7 -digit number will be given as an integer input.

package Page17;
import java.util.Scanner;
public class Rotate7digitNumberToRightbyThree {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T>0){
      int n= sc.nextInt();
      int digits = n % 1000;
      n = n / 1000;
       n = digits * 10000 + n;
      System.out.println(n);
     T--;
    }
    sc.close();
  }
  
}

// O/P-->
// 1
// 1234567
// 5671234


