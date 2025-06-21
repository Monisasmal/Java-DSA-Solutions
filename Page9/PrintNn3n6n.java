// You will be given an input n of integer data type.

// You have to print the series n, n-3, n-6....

// Important points:

// 1. You have to print each number in a different line

// 2. Also you have to print till the time the printed value is greater than 0.

// Take a look at the sample test cases.

// Input Format

// For each test case, you will be given n as an integer input.


package Page9;
import java.util.Scanner;
public class PrintNn3n6n {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i>0; i-=3){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 20
// 20
// 17
// 14
// 11
// 8 
// 5 
// 2
