// John, a software developer, was tasked with writing a program to print the vowels in a given string. He created a loop to iterate over each character and check if it was a vowel. He tested it and it worked perfectly.

// Input Format

// For each test case, you will get a string str.

package Page10;
import java.util.Scanner;
public class PrintVowelsintheString {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for(int i = 0; i<str.length(); i++){
      char ch = str.charAt(i);
if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
  System.out.println(ch);
}
    }
    sc.close();
  }
}

// O/P-->
// banana
// a
// a
// a
