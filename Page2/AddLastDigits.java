// You will be given two numbers of int data-type as input, and you have to print the sum of their last digits as output.

// Test Case 1:

// Given Inputs: 2357 48986

// Expected Output: 13


import java.util.Scanner;

public class AddLastDigits {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int lastDigit1 = x%10;
    int lastDigit2 = y%10;
    System.out.println(lastDigit1+lastDigit2);
    sc.close();
  }
}

// O/P--> 
// 23456
// 9873
// 9
