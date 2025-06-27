// As part of his programming assignment, Jack was required to write a program that would print each number from 1 to n on a new line. Jack used a loop to iterate over the numbers and printed each number on a new line. The program worked perfectly, and Jack submitted it on time.

// Input Format

// For each test case, you will get n as an integer input.

package Page11;
import java.util.Scanner;
public class PrintNumbers1NinSeparateLines {
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  for(int i = 1; i<=n; i++){
    System.out.println(i);
  }
  sc.close();
 }  
}


// O/P-->
// 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10