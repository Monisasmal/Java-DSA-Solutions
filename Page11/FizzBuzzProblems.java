
// The rules of the FizzBuzz game are given below:
// If a given number is divisible by 3 then the program should print "Fizz".
// If a given number is divisible by 7 then the program should print "Buzz".
// If a given number is divisible by both 3 and 7 then the program should print "FizzBuzz".
// Otherwise print the given number as it is.
// Input Format
// For each test case, you will get n as an integer input.

package Page11;
import java.util.Scanner;
public class FizzBuzzProblems {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      if(i%3 == 0 && i%7 == 0) System.out.println("FizzBuzz" + " ");
      else if(i%3 == 0) System.out.println("Fizz" + " ");
      else if(i % 7 == 0) System.out.println("Buzz" + " ");
      else System.out.println(i + " ");
    }
    sc.close();
  }
}

// O/P-->
// 21
// 1 
// 2
// Fizz
// 4
// 5
// Fizz 
// Buzz
// 8
// Fizz
// 10
// 11
// Fizz
// 13
// Buzz
// Fizz
// 16
// 17
// Fizz
// 19
// 20
// FizzBuzz
