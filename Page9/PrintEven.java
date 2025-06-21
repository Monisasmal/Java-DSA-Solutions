// Given a integer n, print all even numbers from 0 till n (including, if even)

// Input Format

// An integer n

package Page9;
import java.util.Scanner;
public class PrintEven {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<=n; i++){
      if(i%2 == 0){
System.out.println(i);
      }
    }
    sc.close();
  }
}

// O/P-->
// 10
// 0 
// 2 
// 4 
// 6 
// 8 
// 10
