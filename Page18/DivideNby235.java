// Take a natural number n as an integer input, and variable steps of integer type as input. Then perform the following operations on it.

// a. If the number is divisible by 2, then keep on dividing the number n by 2, till the time the number is divisible by 2 and also increment the variable steps by 2, each time you divide the number by 2.

// b. Also, check If the number is divisible by 3, then keep on dividing the number n by 3, till the time the number is divisible by 3 and also increment the variable steps by 3, each time you divide the number by 3.

// c. Also, If the number is divisible by 5, then keep on dividing the number n by 5, till the time the number is visible by 5 and also increment the variable steps by 5, each time you divide the number by 5.

// In the end print the value of the variable steps in the first line and final value of number n in the second line.

// Input Format

// For each test case, n will be given in the first line,

// steps will be given in the second line.

package Page18;

import java.util.Scanner;

public class DivideNby235 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int steps = sc.nextInt();
    while(n % 2 == 0){
      n /= 2;
      steps += 2;
    }
    while(n % 3 == 0){
      n /= 3;
      steps += 3;
    }
    while(n % 5 == 0){
    n /= 5;
    steps += 5;
    }
    System.out.println(steps);
    System.out.println(n);
    sc.close();
  }
}

// O/P-->
// 210
// 7

// 17
// 7 
