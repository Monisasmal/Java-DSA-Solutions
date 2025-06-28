// nth term Tn of The Tribonacci sequence is defined as follows:

// T0(0th term) = 0, 
// T1(1st term) = 1, 
// T2(2nd term) = 1, 
// and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Take n as an integer inout, print the value of Tn(nth term) as an integer output.

// Input Format

// For each test case, n will be given as an integer input.



package Page12;
import java.util.Scanner;
public class PrintnthTribonacciNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t1 = 0;
    int t2 = 1;
    int t3 = 1;
    for(int i = n; n>0; n--){
      int result = t1+t2+t3;
      t1 = t2;
      t2 = t3;
      t3 = result;
    }
    System.out.println(t1);
    sc.close();
  }
}

// O/P-->
// 0
// 0
