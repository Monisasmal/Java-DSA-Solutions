// Take an integer n as an integer input, and then

// print the first multiple of 5 in the first line,

// print the first two multiples of 5 in the second line.

package Page14;
import java.util.Scanner;
public class Pattern6 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j =1; j<=i; j++){
        int result = j*5;
        System.out.print(result + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 6

// 5 
// 5 10
// 5 10 15
// 5 10 15 20
// 5 10 15 20 25
// 5 10 15 20 25 30 
