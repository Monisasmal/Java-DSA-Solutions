// Maria, a software developer, created a program that takes four integer inputs, determines their product, and prints true if the product is greater than 1000 and false otherwise. The program accurately determines the product and outputs true or false based on the value, helping Maria and her team quickly evaluate the product of four integers.


import java.util.Scanner;

public class abcd88 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int w = sc.nextInt();
    int result = x*y*z*w;
    if(result > 1000){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
    sc.close();
  }
}

// O/P-->
// 4
// 2
// 3
// 5
// false
