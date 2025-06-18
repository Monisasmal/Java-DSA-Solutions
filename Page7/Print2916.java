// You will be given an input n of integer data-type. You have to print numbers of the series 2, 9, 16, 23.... till n in different lines, where the last number printed should be an integer just less than n or equal to n.

// To be clear, you will print n if it belongs to the series.

package Page7;
import java.util.Scanner;
public class Print2916 {
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 2; i<=n; i+=7){
      System.out.println(i);
    }
    sc.close();
 } 
}

// O/P-->
// 40
// 2 
// 9 
// 16
// 23
// 30
// 37
