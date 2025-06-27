// You have given an integer n , you have to print first n numbers of the fibonacci series till n.

// Input Format

// First and only line of input contains integer n denoting the number.


package Page11;
import java.util.Scanner;
public class FibonacciNumber12 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int f1 = 0;
    int f2 = 1;
    System.out.print(f1 + " " + f2 + " ");
    for(int i = 2; i<n; i++){
      int fib = f1+f2;
      System.out.print(fib + " ");
      f1 = f2;
      f2 = fib;
    }
    sc.close();
  }
}

// O/P-->
// 5
// 0 1 1 2 3 
