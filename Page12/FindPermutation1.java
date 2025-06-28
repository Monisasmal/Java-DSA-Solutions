// Given n and r, find the value of nPr.

// ( formula of npr=n!/(n-r)! ) 
// Input Format

// Take 2 input n and r as integer.

package Page12;
import java.util.Scanner;
public class FindPermutation1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int x = 1;
    for(int i = n; i>(n-r); i--){
      x *= i;
    }
    System.out.println(x);
    sc.close();
  }
}

// O/P-->
// 5
// 2

// 20
