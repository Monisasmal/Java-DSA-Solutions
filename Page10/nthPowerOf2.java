// Meet John, a computer science student who is working on a project for his algorithms class. One of the tasks he has been assigned is to write a function that takes in an integer n and returns the nth power of 2. For example, if n is 3, the function should return 8 because 2 to the power of 3 is 8.

// Can you help John come up with a solution for this problem?

// Input Format

// The first and the only line of each test case contains an integer n.


package Page10;
import java.util.Scanner;
public class nthPowerOf2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double result = Math.pow(2,n);
    System.out.println((int)result);
    sc.close();
  }
}

// O/P-->
// 4
// 16
