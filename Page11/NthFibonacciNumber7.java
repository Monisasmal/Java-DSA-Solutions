// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

// F(n) = F(n-1) + F(n-2), 
// Where, F(1) = F(2) = 1
// Provided N you have to find out the Nth Fibonacci Number.

// Input Format

// The first line of each test case contains a real number N.


package Page11;
import java.util.Scanner;
public class NthFibonacciNumber7 {
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    int f1 = 1;
    int f2 = 1;
    int fib = 0;
    for(int i = 2; i<n; i++){
      fib = f1+f2;
      f1 = f2;
      f2 = fib;
    }
   System.out.println(f2);
   sc.close();
  }
}

// O/P-->
// 6
// 8
