// Take a Character as Input and check whether the character is in Uppercase or Lowercase.

// Print "Char is Uppercase" if the given character is an Uppercase or Capital Alphabet, and print "Char is Lowercase" if the character is an Lowercase or Small Alphabet.

package Page7;
import java.util.Scanner;
public class UpperCaseOrLowerCase {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z') System.out.println("Char is Lowercase");
    else if(ch >= 'A' && ch <= 'Z') System.out.println("Char is Uppercase");
    else System.out.println();
    sc.close();
  }
}

// O/P-->
// a
// Char is Lowercase
