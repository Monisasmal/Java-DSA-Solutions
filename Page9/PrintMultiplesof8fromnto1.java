// The problem requires a program to print multiples of 8, starting from a given value N down to 1. The value of N will be taken as input from the user.

// Emily, a young programmer, was tasked with this challenge. She used a while loop and initialized the loop variable to the value of N. Inside the loop, she checked whether the loop variable was a multiple of 8 and printed it to the console if it was. Then, she decremented the loop variable by 1 until it reached 1.

// With a few attempts, Emily was able to solve the problem. She was thrilled to have completed the task and felt more confident in her programming abilities.

// Input Format

// For each test case, you will get n as an integer input.


package Page9;
import java.util.Scanner;
public class PrintMultiplesof8fromnto1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = n; i >= 1; i--){
      if(i%8 == 0){
        System.out.println(i);
      }
    }
    sc.close();
  }
}

// O/P-->
// 30
// 24
// 16
// 8 
