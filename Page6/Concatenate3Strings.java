// You will be given three strings as string data-type input in three separate lines, you need to simply concatenate them and print the length of the string in the first line, and the character at 2nd index in the second line.

package Page6;
import java.util.Scanner;
public class Concatenate3Strings {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str3 = sc.nextLine();
    String result = str1+str2+str3;
    System.out.println(result.length());
    System.out.println(result.charAt(2));
    sc.close();
  }
}

// O/P-->
// abc
// def
// gh
// 8
// c
