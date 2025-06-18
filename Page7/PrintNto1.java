// You will be given an input n as an integer data-type. You have to print the series from n to 1 in n different lines.

package Page7;
import java.util.Scanner;
public class PrintNto1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =n; i>=1; i--){
      System.out.println(i);
    }
    sc.close(); 
  }
}

// O/P-->
// 9
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
