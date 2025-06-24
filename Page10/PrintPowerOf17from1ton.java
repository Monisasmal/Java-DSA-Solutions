// Sophie, a computer science student, wrote a program to print the power of 17 from 1 to n, where n is taken as input from the user. She used the while loop to calculate the power of 17 and tested it successfully. Sophie's professor was impressed with her programming skills and asked her to present her solution to the class.

// Input Format

// For each test case, you will get n as an integer input.


package Page10;
import java.util.Scanner;
public class PrintPowerOf17from1ton {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int powerOf17 = 1;
    for(int i = 1; i<=n; i++){
      powerOf17 *= 17;
      System.out.println(powerOf17);
    }
    sc.close();
  }
}

// O/P-->
// 4
// 17   
// 289  
// 4913 
// 83521
