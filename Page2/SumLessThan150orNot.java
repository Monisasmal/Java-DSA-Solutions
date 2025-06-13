// You will be given three integer inputs x, y, z. You have to find the sum of these inputs. Print true if the sum is less than 150 and false otherwise.

import java.util.Scanner;

public class SumLessThan150orNot {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x+y+z < 150){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
    sc.close();
  }
}

// O/P-->
// 50
// 80
// 20
// False
