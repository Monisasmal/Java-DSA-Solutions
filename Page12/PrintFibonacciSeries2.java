// You are given an input n as an integer input , Write a program to print the alternate fibonacci numbers starting from the first fibonacci till the nth fibonacci numbers accordingly , if nth fibonacci number is part of the series or not.

// Input Format

// For each test case, you will get n as an integer input.


package Page12;
import java.util.Scanner;
public class PrintFibonacciSeries2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f1 = 0;
    int f2 = 1;
    int result = 1;
    while(result <= n){
      if(result % 2 != 0){
        System.out.println(f1);
      }
      int fib = f1+f2;
      f1 = f2;
      f2 = fib;
      result++;
    }
    sc.close();
  }
}

// O/P-->
// 10
// 0 
// 1 
// 3 
// 8 
// 21
