// Write a Program to check whether a given number n is a Palindrome or not.

// Definition of Palindrome:- A number which is equal to the reverse of the number.

// Input Format

// For each test case, you will get an positive integer input.

package Page17;

import java.util.Scanner;

public class CheckPalindrome {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int  T = sc.nextInt();
    while(T>0){
      int n = sc.nextInt();
      int temp = n;
      int reverseNumber = 0;
      while (n>0) {
        int digit = n % 10;
        reverseNumber = reverseNumber * 10 + digit;
        n = n/10;
      }
      if(temp == reverseNumber){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
      T--;
    }
    sc.close();
  }
}

// O/P-->
// 2
// 121
// Yes
// 234
// No
