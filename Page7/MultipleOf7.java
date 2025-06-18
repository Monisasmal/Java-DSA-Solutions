// Take an integer N as input, and print all the multiples of 7 till N(inclusive).

package Page7;
import java.util.Scanner;
public class MultipleOf7 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =0; i<=n; i++){
      if(i % 7 == 0){
        System.out.print(i + " ");
      }
    }
    sc.close();
  }
}

// O/P-->
// 98
// 0 7 14 21 28 35 42 49 56 63 70 77 84 91 98 
