// Take n, k and m as integer inputs and Print the series n, n-3k, n-6k, n-9k, n-12k, n-15k, n-18k… using a while loop. Print till the time the printed value is greater than equal to m.

// Input Format

// take n as an integer input in the first line

// k as an integer input in the second line

// m as an integer input in the third line.


package Page13;
import java.util.Scanner;
public class PrintNn3k {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int k = sc.nextInt();
   int m = sc.nextInt();
   int i = n;
   while(m <= i){
    System.out.println(i+" ");
    i -= 3*k;
   }
   sc.close();
  }
}

// O/P-->
// 20
// 1
// 2

// 20 
// 17 
// 14 
// 11 
// 8
// 5 
// 2
