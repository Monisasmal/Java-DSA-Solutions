// Take a number n greater than or equal to zero as an integer input.

// Then you will be given n digits as integer inputs and you have to form a number from it. Print the number formed.

// Then you have to reverse the digits of this number. And then print the final reversed number in the next line.

// Input Format

// For each test case,

// n will be given as an integer input,

// then you will be given n digits as integer inputs in each line.


package Page17;
import java.util.Scanner;
public class ReverseNdigitNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int num = 0;
    int i = 1;
     while(i<=n){
      int digit = sc.nextInt();
      num = num *10 + digit;
      i++;
     }
     System.out.println(num);
     while(num > 0){
      System.out.print(num%10);
      num = num/10;
     }
     sc.close();
  }
}

// O/p-->
// 4

// 2
// 3
// 5
// 6

// 2356
// 6532
