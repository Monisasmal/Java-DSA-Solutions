// The process goes like:

// You have to first take input of two numbers x and y as an integer input.

// Then make a function findSum(int x, int y), which takes in these two integers as parameters and prints the final sum.

// Input Format

// T will be given as input represents the number of test cases.

// For each test case,

// x will be given as input in the first line,

// y will be given as input in the second line.

package Page16;

import java.util.Scanner;

public class Findsumusingafunction {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T>0){
      int a = sc.nextInt();
      int b = sc.nextInt();
      addTwoNumber(a,b);
      T--;
      
    }
    sc.close();
  }
  public static void addTwoNumber(int a, int b){
    int sum = a + b;
    System.out.println(sum);
  } 
}

// O/P-->
// 2
// 10
// 20
// 30
// 30
// 40
// 70
