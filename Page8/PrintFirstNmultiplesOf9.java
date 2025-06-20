// Alice, a programmer, was given a task to write a program that prints the first N multiples of 9 in a single line. She tackled the problem by using a loop to iterate over the numbers . Finally, Alice printed all N multiples of 9 in a single line.

// Input Format

// A single line take N as a input from user

package Page8;
import java.util.Scanner;
public class PrintFirstNmultiplesOf9 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      int result = 9 * i;
      System.out.print(result + " ");
    }
    sc.close();
  }
}

// O/P-->
// 20
// 9 18 27 36 45 54 63 72 81 90 99 108 117 126 135 144 153 162 171 180 
