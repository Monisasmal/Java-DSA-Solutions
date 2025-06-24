// Meet Maria, a math teacher who is preparing a lesson plan for her students. One of the activities she wants to include is a challenge for her students to find all the multiples of 3, 5, and both 3 and 5, within a given range. She has decided to use a program to generate the list of multiples for her students. Can you help Maria write a program that takes in an integer n and returns a list of all the multiples of 3, 5, and both 3 and 5, starting from 1 and going up to n?

// Input Format

// The first and the only line of each test case contains an integer n.


package Page10;
import java.util.Scanner;
public class MultiplesOf35andBoth3and5 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
for(int n = 1; n<=x; n++){
    if(n%3 == 0 && n%5 == 0){
      System.out.println(n +" ");
    }else if(n%3 == 0){
      System.out.println(n+" ");
    }else if(n%5 == 0){
      System.out.println(n+" ");
    }
  }
    sc.close();
  }
}

// O/P-->
// 15
// 3 
// 5  
// 6  
// 9  
// 10 
// 12 
// 15
