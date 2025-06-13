// Take the base and height of a triangle as input and store them in double variables x and y and print its area.

// x and y both will be given as input as a double data-type.

import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double l = sc.nextDouble();
    double b = sc.nextDouble();
    double area = (l*b)/2;
    System.out.println(area);
    sc.close();
  }
}

// O/p==>
// l = 4;
// b = 8;
// area = 16
