// A programming task was assigned to a beginner named Emily. The task was to take an integer input n and print the nth power of 10 integers as an output. Emily successfully completed the task by taking the input value of n and using it to access the desired element of the sequence.

// Input Format

// For each test case, n will be given as an integer input.


package Page12;
import java.util.Scanner;
public class nthpowerof10UsingWhileLoop {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 1;
    for(int i =0; i<n; i++){
      result *= 10;
    }
    System.out.println(result);
    sc.close();
  }
}

// O/P-->
// 3
// 1000
