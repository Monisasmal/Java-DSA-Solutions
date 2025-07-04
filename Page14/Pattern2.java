// Take n as an integer input and then print a star rectangle such that each line has n stars.

// Also, there are 12 such lines.

// Input Format

// For each test case, take n as an integer input.

package Page14;
import java.util.Scanner;
public class Pattern2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<12; i++){
      for(int j = 0; j<n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 5
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****
