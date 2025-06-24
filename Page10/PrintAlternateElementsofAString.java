// Sonu is a computer science student who is working on a project that involves processing text data. He has been asked to write a program that will take a string as input and output every other character of that string, starting with the first character. John is excited to work on this problem because he knows that it will require him to use his programming skills to solve a real-world problem. He knows that the program he writes will be able to take a string as input, such as abcdefg, and output the alternate characters, aceg. John is confident that he can write a solution to this problem and is eager to get started.

// Input Format

// Take string a an input.

package Page10;
import java.util.Scanner;
public class PrintAlternateElementsofAString {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(int i = 0; i<str.length(); i+=2){
      System.out.println(str.charAt(i));
    }
    sc.close();
  }
}

// O/P-->
// manaswini
// m
// n
// s
// i
// i
