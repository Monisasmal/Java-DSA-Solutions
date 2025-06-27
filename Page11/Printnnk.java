// You will be given three integer inputs N,K and L and you to print the series N, N-K, N-2K, N-3K.... till last where the value printed in the end should be just greater than or equal to the given input L.

// To be clear: You will print L if L belongs to the series.

// Input Format

// For each test case, you will get

// N in the first line as an integer input,

// K in the second line as an integer input,

// L in the third line as an integer input.


package Page11;
import java.util.Scanner;
public class Printnnk {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int l = sc.nextInt();
    for(int i = n; i>l; i -= k){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 50
// 5
// 4
// 50
// 45
// 40
// 35
// 30
// 25
// 20
// 15
// 10
// 5
