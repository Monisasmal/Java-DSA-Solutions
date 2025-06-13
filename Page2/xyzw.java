// You will be given four integer inputs x, y, z, w. Print True if x*y is equal to z*w and False otherwise.

import java.util.Scanner;

public class xyzw {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int w = sc.nextInt();

    if(x*y == z*w){
      System.out.println("True");
    }else{
      System.out.println("False");
    }
    sc.close();
  }
}


// O/p-->
// 5
// 8
// 10
// 4
// True