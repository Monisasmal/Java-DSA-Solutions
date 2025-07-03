// Take an integer input n and then keep on dividing n by 2, till the time n is greater than equal to 1.

// Each time you divide n by 2, increment steps by 1.

// Print the total number of steps in end.

// Note : use function.

// Input Format

// For each test case, take an integer input n.

package Page13;
import java.util.Scanner;
public class PrintTotalstepsWhenn2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    while(n>=1){
      n /= 2;
      result++;
    }
    System.out.println(result);
    sc.close();
  }
}

// O/P-->
// 109
// 7

// 34
// 6
