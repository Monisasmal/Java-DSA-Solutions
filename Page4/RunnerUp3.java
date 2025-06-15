// Three numbers A, B and C are the inputs. Write a program to find second largest among them.

// Input Format

// For each test case, you will get

// A in the first line as an integer input,

// B in the second line as an integer input,

// C in the third line as an integer input.


import java.util.Scanner;

public class RunnerUp3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    if(A<C && A>B){
      System.out.println(A);
    }else if(B>A && B<C){
      System.out.println(B);
    }else{
      System.out.println(C);
    }
    sc.close();
  }
}

// O/P-->
// 120
// 11 
// 400
// 120