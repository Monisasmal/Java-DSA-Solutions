// Take in two inputs x and y from the user, and then

// a. If the value of x is greater than or equal to 59 and y is greater than or equal to 10, then print

// X is greater than or equal to 59 and y is greater than or equal to 10

// b. If the value of x is greater than or equal to 50, and y is less than 10, then print

// X is greater than or equal to 50 and y is less than 10

// c. Else print None of the condition matches

import java.util.Scanner;

public class TellAboutXY {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(x >= 60 && y >= 10){
      System.out.println("x is greater than or equal to 59 and y is greater than or equal to 10");
    }else if( x >= 50 && y < 10){
      System.out.println("x is greater than or equal to 50, and y is less than 10");
    }else{
      System.out.println("None of the condition matches");
    }
    sc.close();
  }
}

// O/P-->
// 60
// 12
// x is greater than or equal to 59 and y is greater than or equal to 10
