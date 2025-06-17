// Take in a character as an input from the user
// a. If the entered character is a digit, then add 100 to the value of the digit entered and print the final answer.
// Convert the digit which is added as a character data-type into the integer data-type using two ways,
// b. Else print This is not a digit

package Page6;
import java.util.Scanner;
public class AddIfADigit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(Character.isDigit(ch)){
      int digit = Character.getNumericValue(ch);
      int value = digit + 100;
      System.out.println(value);
    }
    else{
      System.out.println("This is not a digit");
    }
    sc.close();
  }
}

// O/P-->
// a
// This is not a digit

// 5
// 105
