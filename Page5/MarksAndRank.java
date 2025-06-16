// Take in marks and rank of a student as an integer input, and follow these conditions below in the stepwise manner, which is if the condition given before fails only then move on to the next condition, otherwise don’t

// a. If marks are below 20 or rank is above 100, print Needs improvement

// b. Or If marks are below 40 or rank is above 80, print Concentrate

// c. Or If marks are below 60 or rank is above 120, print Needs to focus

// d. Or if marks are above 100 or rank is below 10, print Very good

// e. If none of the above condition follows, print Bright Student

package Page5;
import java.util.Scanner;
public class MarksAndRank {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int marks = sc.nextInt();
  int rank = sc.nextInt();
  if(marks < 20 || rank > 100){
    System.out.println("Needs improvement");
  }else if(marks < 40 || rank > 80) System.out.println("Concentrate");
  else if(marks < 60 || rank > 120) System.out.println("Needs to focus");
  else if(marks > 100 || rank > 10) System.out.println("Very good");
  else System.out.println("Bright Student");
  sc.close();
  }
}

// O/P-->
// 15
// 90
// Needs improvement
