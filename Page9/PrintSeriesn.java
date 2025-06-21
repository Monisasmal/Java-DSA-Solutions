// You are required to write a program that takes two integer inputs: n and k. The program should generate a series of numbers based on the following pattern:

// n, n-3k, n-6k, n-9k, n-12k, and so on, until the value to be printed is greater than zero.

// Your task is to implement a program that will output this series of number.

// Input Format

// For each test case, you will get n and k as an integer input.


package Page9;
import java.util.Scanner;
public class PrintSeriesn {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    for(int i = n; i>=0; i= i-3*k){
      System.out.println(i + " ");
    }
    sc.close();
  }
}

// O/P-->
// 20
// 2
// 20 
// 14 
// 8  
// 2  
