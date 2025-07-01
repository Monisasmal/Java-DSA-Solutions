
// Take an integer N as input.

// Print the number of digits present in N.

// Input Format

// An integer input N.

package Page13;
import java.util.Scanner;
public class NumberOfDigits {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    while(n>0){
n /= 10;
result++;
    }
    System.out.println(result);
    sc.close();
  }
}

// O/P-->
// 523
// 3
