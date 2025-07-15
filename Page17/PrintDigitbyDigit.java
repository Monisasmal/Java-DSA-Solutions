// Given a three-digit positive number. Print its digits one by one starting from the digit at one’s place to the digit at hundred’s place in a separate line.

// Input Format

// For each test case, A three digit number will be given as a positive integer input.

package Page17;
import java.util.Scanner;
public class PrintDigitbyDigit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      System.out.println(n%10);
      n = n/10;
    }
    sc.close();
  }
}

// O/P-->
// 197
// 7
// 9
// 1
