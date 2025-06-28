// Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running product of a series of integers. You decide to give her a problem to work on as practice.

// The problem is as follows: Maria will be given a series of n integers as input, she has to print the product after she take input of an integer each time.

// For example, if the series of integers is3, 4, 5, 6the output should be 3, 12, 60, 360 Maria is a little bit confused at first, but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

// Input Format

// First line contains integer N.

// Second line contains N integers.


package Page12;
import java.util.Scanner;
public class RunningProductWhileloop {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int product = 1;
    for(int i = 1; i<=n; i++){
      int num  = sc.nextInt();
      product *= num;
      System.out.println(product); 
    }
    sc.close();
  }
}

// O/P-->
// 4
// 3 4 5 6

// 3  
// 12 
// 60 
// 360
