// Take Integer N as input and print the following pattern.


package Page14;
import java.util.Scanner;
public class Pattern_5 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=(n-i); j++){
        System.out.print(" ");
      }
      for(int k = 1; k<=i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 5
//     *
//    **
//   ***
//  ****
// *****
