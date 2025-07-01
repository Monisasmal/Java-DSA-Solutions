// Imagine Charlie is a high school student who is learning programming as a hobby. One day, he comes across the following problem:

// "Write a program that takes an integer input from the user. The program should print the digits of the number starting from the end, going towards the first digit, where each digit should be printed on a separate line. Can you write a solution for this problem?"

// Input Format

// The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// For each test case, print n as an integer input


package Page13;
import java.util.Scanner;
public class PrintAllDigitsFromEnd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n>0) {
      System.out.println(n%10);
      n /= 10;
    }
    sc.close();
  } 
}

// O/P-->
// 7654
// 4
// 5
// 6
// 7
