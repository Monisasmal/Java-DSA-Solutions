// You are given a 6 digit number n , you have to pick the last 2 digits of the number of and put them in the starting.

// Your task is to write a Program for the above problem and Print the Transformed number.

// Input Format

// For each test case, you will given a number n as an integer input.

package Page17;
import java.util.Scanner;
public class TransformaNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit = n%100;
    n = n/100;
    n = digit * 10000 + n;
    System.out.println(n);
    sc.close();
  }
}

// O/P-->
// 123456
// 561234
