// Take in a character as an input from the user,

// A. Conditon 1: If the character is an alphabet then you need to toggle the character first,

// For eg, if the entered character is a, then convert it into A, and if the entered character is A then convert it into a, this simply means that if the entered character is a capital case then convert it into small case character and vice-versa.

// After toggling the character, a. if the resultant character is not ‘a’, ‘A’, ‘b’, ‘B’, then take two jumps to the left and print the character, for eg. If the toggled character is c then print a, If the toggled character is Z, then print X.

// b. If the toggled character is ‘a’, ‘A’, ‘b’, ‘B’, then print Sorry

// B. Condition 2: Otherwise print No alphabet

package Page7;
import java.util.Scanner;
public class ToggleAnd2JumpsLeft {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    char toggleCharater = '0';
    if(Character.isLowerCase(ch)){
      toggleCharater = Character.toUpperCase(ch);
    }else if(Character.isUpperCase(ch)){
      toggleCharater = Character.toLowerCase(ch);
    }else{
      System.out.println("No Alphabets");
      return;
    }
    if((toggleCharater != 'a')&& (toggleCharater != 'b') && (toggleCharater != 'A') && (toggleCharater != 'B')){
      char result = (char)(toggleCharater-2);
      System.out.println(result);
    }else{
      System.out.println("Sorry");
    }
    sc.close();
  }
}

// O/P-->
// d
// B
