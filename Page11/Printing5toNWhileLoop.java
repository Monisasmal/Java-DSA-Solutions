// WAP to print numbers from 5 to n(using while loop) where n is taken as input from the user using while loop.
// Input Format
// Input integer N


package Page11;
import java.util.Scanner;
public class Printing5toNWhileLoop {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 5;
    while(i<=n){
      System.out.println(i);
      i++;
    }
    sc.close();
  }
}

// O/P-->
// 15
// 5 
// 6 
// 7 
// 8 
// 9 
// 10
// 11
// 12
// 13
// 14
// 15
