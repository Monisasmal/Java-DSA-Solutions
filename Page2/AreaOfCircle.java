// Given the diameter of the circle as input, print its area.

// For pi use 22/7 instead of 3.14 or Math.pi.

// Also Area=(22*radius*radius)/7

// Explanation 0

// 8 is the diameter of the circle, so 4 is the radius. So area is 50.2857, but since we have to print an integer so we print 50.




import java.util.Scanner;

public class AreaOfCircle {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int x = r/2;
    int area = (22*x*x)/7;
    System.out.println((area));
    sc.close();
  }
}

// O/P-->
// r = 10
// area = 78