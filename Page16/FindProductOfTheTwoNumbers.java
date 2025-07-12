// The process goes like:

// First take in two integer inputs x and y.

// Then make a function findProduct(int x, int y) which takes in an integer as an input then print the product of x and y.

// Input Format

// T will be given as an integer input which represents the number of test cases.

// For each test case,

// x will be given as an integer input in the first line,

// y will be given as an integer input in the second line.

package Page16;

import java.util.Scanner;

public class FindProductOfTheTwoNumbers {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      int x = sc.nextInt();
      int y = sc.nextInt();
      productTwoNumber(x,y);
      n--;
    }
    sc.close();
  }
  public static void productTwoNumber(int x, int y){
    int result = x * y;
    System.out.println(result);
  }
}

// O/P-->
// 2

// 3
// 4

// 12

// 5
// 6

// 30
