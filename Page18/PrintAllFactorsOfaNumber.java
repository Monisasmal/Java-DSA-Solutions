// Take a whole number N as an integer input and print all the factors of it such that each factor should be printed in a separate line.

// Input Format

// N will be given as an integer input.

package Page18;
import java.util.Scanner;
public class PrintAllFactorsOfaNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      if(n % i == 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}

// O/P-->
// 72

// 1
// 2
// 3
// 4
// 6
// 8
// 9
// 12
// 18
// 24
// 36
// 72
