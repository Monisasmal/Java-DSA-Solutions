// Meet Sarah, a software developer who is working on a new project for her company. One of the tasks she has been assigned is to write a program that takes in a string and returns the string in reverse order. Can you help Sarah come up with an algorithm to solve this problem?

// Input Format

// The first and the only line of each test case is a string.

package Page10;
import java.util.Scanner;
public class ReverseTheString {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
   for(int i = str.length()-1; i>=0; i--){
    System.out.print(str.charAt(i));
   }
   sc.close();
  }
}

// O/P-->
// manaswini
// iniwsanam
