// You are given a number n , Write a program to reverse digits of n.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case, you will get an integer input.

package Page17;

import java.util.Scanner;

public class ReverseDigits {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      int n = sc.nextInt();
      while(n>0){
        System.out.print(n%10);
        n/=10;
      }
      System.out.println();
      t--;
    }
    sc.close();
  }
}

// O/P-->
// 2
// 1234
// 4321
// 6789
// 9876
