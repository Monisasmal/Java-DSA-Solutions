// A teacher is explaining factorial to the students. Since, the calculation involved in factorial is a bit difficult for him to do. The teacher wants to write a program, so that he doesn't need to calculate the factorial of every number. You have to help the teacher in writing a program for factorial calculation.

// Take an integer N as input.

// Print the factorial of N.


package Page15;

import java.util.Scanner;

public class FactorialofN {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long num =1;
    for(int i = n; i>0; i--){
      num *=  i;
    }
System.out.println(num);
sc.close();
  }
}

// O/P-->
// 5
// 120
