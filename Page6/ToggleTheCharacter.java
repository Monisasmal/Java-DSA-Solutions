// Take in a character as an input from the user

// a. If the entered character is a small-case character, the convert it into the corresponding uppercase character and print it.

// b. If the entered character is an upper-case character, the convert it into the corresponding lowercase character and print it.

// Input Format

// For each test case, you will get an alphabet as a character input.

package Page6;
import java.util.Scanner;
public class ToggleTheCharacter {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z'){
      char UpperCase = (char)(ch-32);
      System.out.println(UpperCase);
    }
    else if(ch >= 'A' && ch <= 'Z'){
      char LowerCase = (char)(ch+32);
      System.out.println(LowerCase);
    }
    System.out.println();
    sc.close();
  }
}

// O/P->
// a
// A



// 0-48
// 9-57
// a-97
// z-122
// A-65
// Z-90

