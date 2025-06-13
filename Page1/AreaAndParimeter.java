// Take length and breadth of the rectangle as input. And print area of the rectangle in the first line and perimeter of the rectangle in the second line.

import java.util.Scanner;

public class AreaAndParimeter{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int area = l*b;
    int Parimeter = 2*(l+b);
System.out.println(area);
System.out.println(Parimeter);
sc.close();
  }
}

// O/P-->
// l = 10
// b = 20
// area = 200
// Parimeter = 60 