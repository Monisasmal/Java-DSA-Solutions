// You are given integer inputs N , a and b. perform operations on a and b for different value of N like :-

// If value of N is 10 -> a + b;

// If value of N is 20 -> a - b;

// If value of N is 30 -> a * b;

// If value of N is 40 -> a % b;

// If value of N is 50 -> a // b;

// However, if N is 40 or 50, and b is 0, print "Error: Integer modulo by zero" or "Error: Division by zero" respectively instead.

// For any other value of N, print "Enter a valid number".

package Page5;
import java.util.Scanner;

public class SwitchCalculator1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(N == 10) System.out.println(x+y);
    else if(N == 20) System.out.println(x-y);
    else if(N == 30) System.out.println(x*y);
    else if(N == 40) System.out.println(x%y);
    else if(N ==50) System.out.println(x/y);
    else System.out.println("Enter a valid number");
    sc.close();
  }
}


// O/P-->
// 20
// 50
// 30
// 20