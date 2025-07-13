// Take in three integer inputs x, y and z. Assign the value of x to y, y to z, z to x. Then print the value of x, y, z in separate lines.

// Input Format

// For each test case,

// x will be given in the first line,

// y will be given in the second line,

// z will be given in the third line.

package Page16;

import java.util.Scanner;

public class Swapxyz {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    x = x+y+z;
    y = x-(y+z);
    z = x-(y+z);
    x = x-(y+z);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    sc.close();
  }
}

// O/P-->
// 10
// 20
// 30

// 30
// 10
// 20
