// There are three friends A , B , C. You will be given the ages of these three friends as an integer input, you have to print the same of the oldest friend among them.

// Input Format

// For each test case, you will be given

// Age of A in the first line as an integer input

// Age of B in the second line as an integer input

// Age of C in the third line as an integer input

import java.util.Scanner;

public class PrintTheOldestAmongThree {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(A>B && A>C){
      System.out.println(A);
    }
    else if(B>C && B>A){
      System.out.println(B);
    }
    else{
      System.out.println(C);
    }
    sc.close();
  }
}

// O/P-->
// 30
// 40
// 50
// 50
