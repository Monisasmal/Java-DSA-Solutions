// Emma was given a programming task to create a program that takes an integer input n and prints the running sum from 1 to n along with its average. Emma created a loop to calculate the sum and average and printed the results to the console. The program worked perfectly, and Emma was praised for her coding skills.

// Input Format

// For each test case, you will get n as an integer input.


package Page12;
import java.util.Scanner;
public class RunningSumAndAverage {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 1; i<=n; i++){
      sum += i;
    }
    double avg = (double) sum/n;
    System.out.println(sum);
    System.out.println((int)avg);
    sc.close();
  }
}

// O/P-->
// 5

// 15
// 3
