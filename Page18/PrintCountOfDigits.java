// You will be given a number greater than or equal to zero. Print the count of digits in the first line and then you have to print its digits from the digit at one’s place till the digit at the at the largest place value such that each digit should be printed in a separate line.

// Input Format

// For each test case, a number will be given.


package Page18;
import java.util.Scanner;
public class PrintCountOfDigits {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int count = 0;
    while(temp>0){
      temp /= 10;
      count++;
    }
    System.out.println(count);
    temp = n;
    while(temp >0){
      System.out.println(temp % 10);
      temp /= 10;
    }
    sc.close();
  }
}

// O/P-->
// 12345

// 5

// 5
// 4
// 3
// 2
// 1
