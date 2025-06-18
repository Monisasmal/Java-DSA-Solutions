// You will be given an integer input n, and you have to print the series 3, 7, 11, 15till the integer just less than n, in n different lines.

package Page7;
import java.util.Scanner;
public class Print371115 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 3; i<n; i+= 4){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 20
// 3 
// 7 
// 11
// 15
// 19
