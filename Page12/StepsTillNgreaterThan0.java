// Meet Jake, a data analyst who is working on a project to analyze the performance of a new machine learning model. One of the tasks he has been assigned is to write a program that simulates the operation of the model by taking an integer input n and performing a series of steps until the value of n becomes 0.

// If n is even, the program should subtract 1 from n. 
// If n is odd, the program should subtract 3 from n. 
// Jake needs to keep track of the total number of steps that the program performs and print this value at the end. Can you help Jake come up with a solution for this problem?

// Input Format

// The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// For each test case, you will be given the value of n as an integer data-type.


package Page12;
import java.util.Scanner;
public class StepsTillNgreaterThan0 {
  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
        int n = sc.nextInt();
        int i = 0;
        while(n > 0){
            if(n % 2 == 0)
                n -= 1;
            else
                n -= 3;
                i++;
        }
        System.out.println(i);
            T--;
    }
    sc.close();    
  }
}

// O/P-->
// 2
// 20
// 10
// 37
// 19
