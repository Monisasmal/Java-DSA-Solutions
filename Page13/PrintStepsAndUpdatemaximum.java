// Take n as input from the user. Then you will be given a list of n positive integers, each time you find a new maximumal value, you have to increment the steps by 1.

// Take steps as 0 initially and maximum value as -100 in the starting.

// In the end print the number of steps performed.

// Note : Use function.

// Input Format

// Take n as an integer input from the user.

package Page13;
import java.util.Scanner;
public class PrintStepsAndUpdatemaximum {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int steps = 0;
    int maxVal = -1;
    for(int i =0; i<n; i++){
      int num = sc.nextInt();
      if(num > maxVal){
        maxVal = num;
        steps++;
      }
    }
    System.out.println(steps);
    sc.close();
  }
}

// O/P-->
// 7
// 2
// 3
// 4
// 5
// 1
// 2
// 10
// 5
