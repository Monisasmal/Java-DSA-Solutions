package Page11;

import java.util.Scanner;

public class Print41322 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 4;
    while(i<=n){
      System.out.println(i);
      i+=9;
    }
    sc.close();
  }
}

// O/P-->
// 55
// 4
// 13
// 22
// 31
// 40
// 49
