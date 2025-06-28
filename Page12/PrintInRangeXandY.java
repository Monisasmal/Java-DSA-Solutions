// Sarah was tasked with printing numbers from x till y, including both x and y, using a while loop. She took inputs for x and y from the user using a while loop, initialized a variable to x, and used a while loop to print the numbers until the value exceeded y. Sarah successfully completed the task, gained experience in using while loops, and felt more confident in her programming abilities.

// Input Format

// x and y are given to you as Input

package Page12;
import java.util.Scanner;
public class PrintInRangeXandY {
  public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y =  sc.nextInt();
    int i = x;
    while(i <= y){
      System.out.println(i);
      i++;
    }
    sc.close();
  }
}

// O/P-->
// 10
// 20
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
