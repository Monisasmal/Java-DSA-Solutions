// Given a number n, print all integers in range 1 to n.
// You can assume that input is a positive integer

package Page7;
import java.util.Scanner;
public class PrintRange {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =1; i<=n; i++){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P->
// 8
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
