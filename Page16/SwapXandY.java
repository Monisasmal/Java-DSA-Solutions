// Given two integers x and y. Swap these integers without using any built-in functions or third variable

// Input Format

// Take x as an integer input in the first line,

// Take y as an integer input in the second line.


package Page16;

import java.util.Scanner;

public class SwapXandY {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int c = x;
    // System.out.println(c);
    x = y;
    System.out.println(x);
    y = c;
    System.out.println(y);
    sc.close();
  }
  
}

// O/P-->
// 40
// 50

// 50
// 40
