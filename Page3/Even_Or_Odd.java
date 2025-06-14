// Print Even if the number is even else print Odd if the number is odd.

import java.util.Scanner;

public class Even_Or_Odd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String result = (x%2 == 0)? "Even" : "Odd";
    System.out.println(result);
    sc.close();
  }
}


// O/P -->
// 40
// Even

// 39
// Odd