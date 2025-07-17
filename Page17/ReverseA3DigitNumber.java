// Take in a three digit number as an integer input and reverse its digits. And then print the final reversed number as an integer output.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// A three digit number will be given as an input.

package Page17;

import java.util.Scanner;

public class ReverseA3DigitNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      int n = sc.nextInt();
      while(n>0){
          int result = n % 10;
          System.out.print(result);
          n = n/10;
      }
      System.out.println();
      t--;
    }
    sc.close();
  }
}

// O/P-->
// 2
// 123
// 321
// 456
// 654
