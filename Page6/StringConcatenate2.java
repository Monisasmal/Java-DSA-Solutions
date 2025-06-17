// Given 2 strings, s1 and s2, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

package Page6;
import java.util.Scanner;
public class StringConcatenate2 {
  public static void main(String aargs[]){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    if(str1.length() < str2.length()){
      System.out.println(str1+str2+str1);
    }else{
      System.out.println(str2+str1+str2);
    }
    sc.close();
  }
}

// O/P-->
// hii
// hello
// hiihellohii
