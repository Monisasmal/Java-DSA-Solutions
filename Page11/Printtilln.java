// The task was given to a novice programmer named Kim to print the first n numbers of the series 5, 11, 17, 23, 29, 35, 41 using a while loop. Kim took the input value of n from the user and completed the task successfully.

// Input Format

// Given a Int Input N


package Page11;
import java.util.Scanner;
public class Printtilln {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 5;
    while(i<n){
      System.out.println(i);
      i += 6;
    }
    sc.close();
  }
}

// O/P-->
// 50
// 5 
// 11
// 17
// 23
// 29
// 35
// 41
// 47
