// Once upon a time, there was a program that took two integers (a and b) as input from the user. The program performed different operations based on the values of a and b.

// If a was greater than 100 and b was greater than 10, the program printed a is above 100 and b is above 10.If this condition was not satisfied, the program checked if a was greater than 50 and b was greater than 50, in which case it printed a is above 50 and b is above 50. If this condition also didn't match, the program checked if a was greater than 20 and b was greater than 100, and printed a is above 20 and b is above 100 if this condition was met. If none of these conditions were met, the program simply printed None.

// Would you like to write a program that performs these operations using your programming skills?

package Page5;
import java.util.Scanner;

public class printAboveGivenAB {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>100 && b >10){
     System.out.println(" a is above 100 and b is above 10");
    }else if(a > 50 && b > 50){
      System.out.println("a is above 50 and b is above 50");
    }else if(a > 20 && b > 100){
      System.out.println("a is above 20 and b is above 100 ");
    }
    else{
      System.out.println("None");
    }
    sc.close();
  }
}

// O/P-->
// 120
// 11
//  a is above 100 and b is above 10
