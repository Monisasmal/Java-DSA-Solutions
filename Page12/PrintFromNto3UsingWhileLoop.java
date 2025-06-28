// A programming task was assigned to a beginner named Mike. He was asked to print numbers from n to 3 using a while loop, where n is taken as input from the user. Mike took the input value of n from the user and used a while loop to print the numbers in reverse order until 3.


package Page12;
import java.util.Scanner;
public class PrintFromNto3UsingWhileLoop {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = n;
    while(i <= 3){
      System.out.println(i);
      i++;
    }
    sc.close();
  }
}

// O/P-->
// -9

// -9
// -8
// -7
// -6
// -5
// -4
// -3
// -2
// -1
// 0
// 1
// 2
// 3
