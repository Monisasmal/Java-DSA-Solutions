// Take n as an integer input. Then print nxn star rectangle as mentioned below.

// In each line, n stars should be printed.

// And there should be n such lines.

// Input Format

// For each test case, n will be given as an integer input.


package Page14;
import java.util.Scanner;
public class Pattern3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
      for(int j =0; j<n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

// O/P-->
// 4
// ****
// ****
// ****
// ****
