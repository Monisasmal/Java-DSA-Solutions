// Take the length as l and breadth as b of a rectangle as input. Write a function that takes length and breadth as integer parameters and returns the area of the rectangle. Print the final area returned.

// Input Format

// first line takes user input length as l.

// second line takes user input breadth as b.

package Page16;

import java.util.Scanner;

public class CalculateArea3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
     int l = sc.nextInt();
     int b = sc.nextInt();
     AreaCalculator(l,b);
     n--;
    }
    sc.close(); 
  }
  public static void AreaCalculator(int x, int y){
    int result = x * y;
    System.out.println(result);
  }
}

// O/P-->
// 2
// 20 40


// 30 20
// 600
