// Take two strings as input by creating a Scanner object. Print the final string as output after concatenation.

// Hello + Friends = HelloFriends

package Page6;
import java.util.Scanner;
public class ConcatenateTwoStrings {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    System.out.println(str1 + str2);

    // OR

    String first = "Hello";
    String second = "World";
    String result = first.concat(" ").concat(second);
    System.out.println(result);

  //  OR

    String output = String.join(" ", "Hello", "World");
    System.out.println(output);

    sc.close();
  }
}

// O/P-->
// Hello     
// Moni
// HelloMoni
// Hello World
// Hello World
