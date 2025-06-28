// A programming task was assigned to a novice programmer named Max to print a sequence of numbers n, n-5, n-10, n-15, n-20.... using a while loop. Max took the input value of n from the user and used a while loop to print the numbers in decreasing order. Within the loop, he used decrement the value of the current number by 5 to print the next number until the value became zero. Max successfully completed the task, learned how to use while loop, and gained experience in manipulating values in a loop.

// Input Format

// Integers N as an input value.

package Page12;
import java.util.Scanner;
public class Printn2n3n {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = n;
    while(i>0){
      System.out.println(i);
      i-=5;
    }
    sc.close();
  }
  
}


// O/P-->
// 25

// 25
// 15
// 10
// 5
