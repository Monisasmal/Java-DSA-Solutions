// You will be given a string as an input, and

// a. If the length of the string is greater than or equal to 4, then print the character at 3rd index.

// b. Otherwise, print Small string

// Eg. If the input string is abcdef, then print d.

package Page6;
import java.util.Scanner;
public class PrintCharacterAt3rdIndex {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str =  sc.nextLine();
    if(str.length() >= 4){
      System.out.println(str.charAt(3));
    }else{
      System.out.println("Small String");
    }
    sc.close();
  }
}

// O/P-->
// abcdef
// d

// a
// Small String
