// Imagine Alice is a computer science student and she is trying to understand a concept related to loops. Her friend Bob, who is a computer science professor, gives her the following problem:

// "Write a program that takes an integer input from the user. The program should keep dividing the integer by 3 and printing the resultant value on each iteration until the value is greater than 0.

// Can you write a solution for this problem?"

// Note: Start printing from n, keep on updating n by dividing n by 3 each time, and print the the updated value of n each time.

// Input Format

// For each test case, n will given as an integer input.

package Page10;
import java.util.Scanner;
public class Print3n {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    for(int i = n; i>0; i/=3){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 24
// 24
// 8 
// 2 
