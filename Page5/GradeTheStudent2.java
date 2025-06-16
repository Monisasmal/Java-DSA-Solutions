// You are given a character ch which represents a grade of a student in a course. The valid grades are A, B, C, and F. Your task is to print a message based on the grade using a switch statement.

// If the grade is A, print Excellent!.

// If the grade is B, print Well done!.

// If the grade is C, print You passed!.

// If the grade is F, print Better luck next time!.

// If the grade is not one of the valid options, print Invalid grade.

// Input Format

// Input contains character ch.


package Page5;
import java.util.Scanner;

public class GradeTheStudent2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch == 'A') System.out.println("Excellent");
    else if(ch == 'B') System.out.println(" Well done!");
    else if(ch == 'C') System.out.println("You passed!");
    else if(ch == 'F') System.out.println("Better luck next time!");
    else System.out.println("Invalid grade");
    sc.close();
  }
}

// O/P-->
// A
// Excellent
