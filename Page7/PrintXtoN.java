// You will be given x and n as an integer input from the user. You have to print the number from x to n(both inclusive), each number in the different line.

package Page7;

import java.util.Scanner;

public class PrintXtoN {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    for(int i = x; i<=n; i++){
      System.out.println(i);
    }
    sc.close();
  }
}

// O/P-->
// 3
// 10
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
