// As a programming enthusiast, Mark enjoyed creating programs that could perform complex calculations and generate interesting patterns. One day, he came across a series of numbers - 3, 11, 19, 27, 35... that intrigued him. He decided to write a program that could print this series up to a given value of n, using i = i + 8.

// Input Format

// A single line take N as a input from user

package Page8;
import java.util.Scanner;
public class PrintSeries31119 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 3; i<=n; i+=8){
      System.out.println(i + " ");
    }
    sc.close();
  }
}

// O/P-->
// 30
// 3  
// 11 
// 19 
// 27 
