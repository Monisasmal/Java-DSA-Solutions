// A beginner programmer named Sarah was tasked to write a program to print the quotient and remainder of two given integers a and b. Sarah took the input values of a and b from the user and used the division and modulus operator to compute the quotient and remainder. She then printed the values in the required format with a space separator. Through this task, Sarah learned how to use basic arithmetic operators to perform mathematical computations and print output in the required format.

// Note : Use Function.

// Input Format

// Take a and b as an input integer.


package Page16;

import java.util.Scanner;

public class QueAndRem {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    result(a,b);
    sc.close();
  }
  public static void result(int a, int b){
   int que = a/b;
   double rem = a%b;
   System.out.println(que + " ");
   System.out.println((int)rem + " ");
  }
}

// O/P-->
// 7
// 2

// 3 
// 1 
