// Print Divisible by 3 and 4 if the given integer is divisible by both 3 and 4

// Print Not Divisible if the given integer is not divisible by both 3 and 4.

// Input Format

// For each test case, you will be given an integer input.

package Page5;
import java.util.Scanner;

public class divisibleByBoth3and4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%3 == 0 && x%4 == 0){
      System.out.println("Divisible by 3 and 4");
    }else{
      System.out.println("Not Divisible");
    }
    sc.close();
  }
}

// O/P-->
// 32
// Not Divisible
