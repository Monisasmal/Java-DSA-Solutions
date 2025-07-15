// Take x and y digits as integer inputs and then form a number xy from it and then finally print that number.

// for eg. if you are the given 3 and 4, then you have to form the number 34 from it and then finally print the number 34.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// Digit x will be given as an integer input in the first line,

// Digit y will be given as an integer input in the second line.


package Page17;

import java.util.Scanner;

public class GivenxandYprintxy{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  while(n>0){
   int  x = sc.nextInt();
   int y = sc.nextInt();
   int num = (x*10)+y;
   System.out.println(num); 
   n--;
  }
  sc.close();
 } 
}

// O/P-->
// 2

// 3
// 4

// 34
// 5
// 6

// 56
