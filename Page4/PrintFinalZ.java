// Take input three numbers x, y, z as an integer input

// Then if the value of x is greater than or equal to 20,

// a. If the value of y is greater than or equal to 100 then add 100 to the value of z.

// b. If the value of y is less than 100 and greater than or equal to 50, then add 50 to the value of z.

// c. Else add 10 to the value of z.

// Else if the value of x is less than 20,

// a. If the value of y is greater than or equal to 100 then add 3 to the value of z.

// b. If the value of y is less than 100 and greater than or equal to 50, then add 2 to the value of z.

// c. Else add 1 to the value of z.

// Print the final value of z as an integer output in the end.


import java.util.Scanner;

public class PrintFinalZ {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x >= 20){
      if(y >= 100){
        System.out.println(z+= 100);
      }else if(y < 100 && y >= 50){
        System.out.println( z += 50);
      }else{
        System.out.println(z += 10);
      }
    }else if(x < 20){
      if(y >= 100){
        System.out.println( z += 3);
      }
      else if(y < 100 && y >= 50){
        System.out.println( z += 2);
      }else{
        System.out.println(z += 1);
      }
    }
    sc.close();
  }
}

// O/P-->
// 22
// 55
// 40
// 90
