// Imagine you are a computer science teacher and one of your students, Ben, is learning about loops and control structures. You decide to give him a problem to work on as practice.

// The problem is as follows: Ben needs to write a program that takes in an integer n as input and prints out all the powers of 2 that are less than n. For example, if n is 10, the program should print out 1, 2, 4, and 8.

// Input Format

// For each test case, you will be given n as an integer input from the user.


package Page10;
import java.util.Scanner;
public class PrintPowersOf2LessThanN {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n =sc.nextInt();
    for(int i = 2; i<n; i *= 2){
      System.out.println(i + " ");
    }
    sc.close();
  }
}


// O/P==>
// 20
// 2 
// 4  
// 8  
// 16 
