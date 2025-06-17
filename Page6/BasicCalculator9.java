// You will be given two integers x,y in the integer data-type format and a character as an input in the character data-type format,

// a. If the entered character is A, then print sum of the two integers in the integer format.

// b. If the entered character is S, then print the value of x - y in the integer format.

// c. If the entered character is M, then print the value of x * y in the integer format.

// d. If the entered character is D, then print the value of x / y in the integer format.

// e. If the entered character is R, then print the value of remainder when x is divided by y.

// f. Else print the string Enter again.

package Page6;
import java.util.Scanner;
public class BasicCalculator9 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    char ch = sc.next().charAt(0);
    if(ch == 'A') System.out.println(x+y);
    else if(ch == 'S') System.out.println(x-y);
    else if(ch == 'M') System.out.println(x*y);
    else if(ch == 'D') System.out.println(x/y);
    else if(ch == 'R') System.out.println(x%y);
    else System.out.println("Enter again");
    sc.close();
  }
}

// O/P-->
// 30
// 50
// M
// 1500
