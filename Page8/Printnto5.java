// Write a program to print numbers from n to 5 .Where n is taken as input from user.
// Input Format
// A single line n take input from user.

package Page8;
import java.util.Scanner;
public class Printnto5 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i>=5; i--){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 10
// 10
// 9 
// 8 
// 7 
// 6 
// 5 
