// Take an integer input n and print n stars in the same straight line.

// Input Format

// You will be given an integer input n.

package Page13;
import java.util.Scanner;
public class Pattern1 {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i =0; i<n; i++){
    System.out.print("*" + " ");
  }
  sc.close();
} 
}

// O/P-->
// 6
// * * * * * * 
