// You will be given an integer as input, you have to print true if the number is greater than 100, and false otherwise.

import java.util.Scanner;

public class GreaterThan100orNot {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x>100){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
    sc.close();
  }
}

// O/P-->
// x = 202
// True
