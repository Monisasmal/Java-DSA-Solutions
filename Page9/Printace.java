// Print a, c, e... till the characters are less than z, where each character is printed in a separate line.

// Input Format

// No input will be given

package Page9;
public class Printace {
  public static void main(String args[]){
    for(char ch = 'a'; ch <= 'z'; ch+=2){
      System.out.println(ch);
    }
  }
}

// O/P-->
// a
// c
// e
// g
// i
// k
// m
// o
// q
// s
// u
// w
// y
