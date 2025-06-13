// You have to take an integer as input and print True if it is an even number and False otherwise.

import java.util.Scanner;

public class EvenOrNot {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%2 == 0){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
    sc.close();
 }
}


// O/P-->
// 56
// True