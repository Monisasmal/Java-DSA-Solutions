// Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running sum of a series of integers. You decide to give her a problem to work on as practice.

// The problem is as follows: Maria will be given a series of n integers as input, she has to print the sum after she take input of an integer each time.

// For example, if the series of integers is 3, 4, 5, 6 the output should be 3, 7, 12, 18

// Maria is a little bit confused at first, but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

// NOTE: Initially the sum is zero.

// Input Format

// For each test case, You will get the value n as an integer input in the first line,

// and n integers as intger input in different lines.

package Page11;
import java.util.Scanner;
public class RunningSumForLoop {
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n =sc.nextInt();
  int sum = 0;
  for(int i = 1; i<=n; i++){
    int m = sc.nextInt();
    sum += m;
    System.out.println(sum);
  }
  sc.close();
 } 
}

// O/P-->
// 5
// 1 2 3 4 5
// 1 
// 3 
// 6 
// 10
// 15
