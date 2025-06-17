// Take in a character as an input and manipulate it as given under

// Condition 1: If the entered character is a small-case character, then
// A. If the character is from character a and till the character w, both a and w included, then Jump three times to right and print the resulting character as explained in the example below,

// For eg. If a is given then print d, If b is given then print the character e, If c is given then print the character f, If w is given then print the character z.

// B. Else print the string Can't jump.

// Condition 2: If the entered character is a capital-case character, then
// A.If the character is from character D and till the character Z, both D and Z included, then Jump three times to left and print the resulting character as explained in the example below,

// For eg. If D is given then print A, If E is given then print the character B, If F is given then print the character C, If Z is given then print the character W.

// B. Else print the string Can't jump.


package Page6;
import java.util.Scanner;
public class jumpingCharacter {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'w'){
      char result = (char)(ch+3);
      if(result <= 'w'){
        System.out.println(result);
      }else{
        System.out.println("Can't jump");
      }
    }else if(ch>='A' && ch<='Z'){
      char result = (char)(ch-3);
      if(result >= 'A'){
        System.out.println(result);
      }else{
        System.out.println("Can't jump");
      }
    }
    else{
      System.out.println("Can't jump");
    }
    sc.close();
  }
}

// O/P-->
// Z
// W
