// Three sides A, B and C will be given . Return True if triangle is valid otherwise False.

// Note : Use Function.

// Input Format

// Given three sides of triangle A,B and C.

package Page16;

import java.util.Scanner;

public class IfTriangleIspossible {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    ifTringle(a,b,c);
     sc.close();
  }

  public static void ifTringle(int a, int b, int c){
    if(a+b>c && b+c>a && c+a>b){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
 
}

// O/P-->
// 7
// 10
// 5
// true
