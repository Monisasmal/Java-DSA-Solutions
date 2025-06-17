// Take in a character as an input and then

// a. Print Small case if it is a small case character.

// b. Print Capital case if it is a capital case character.

// c. Print Digit if it is a digit.

// d. Print None is none of the above conditions follow.

// Input Format

// For each test case you will get a character as an input from the user.

package Page6;
import java.util.Scanner;
public class SmallCapitalOrDigit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z') System.out.println("Small Case");
    else if(ch >= 'A' && ch <= 'Z') System.out.println("Upper Case");
    else if(ch >= '0' && ch <= '9') System.out.println("Digit");
    else System.out.println("None");
    sc.close();
  }
}

// O/P-->
// 11
// Digit
