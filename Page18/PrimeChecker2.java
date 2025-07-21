// Write a Java program to check whether a number is a Prime number or not.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// First line contain an integer N.

package Page18;

import java.util.Scanner;

public class PrimeChecker2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T>0){
      int num = sc.nextInt();
      int count = 0;
      for(int i = 2; i<=num/2; i++){
        if(num %2 == 0){
          count++;
          break;
        }
      }
      if(count == 0){
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

// 1
// 5
// Yes