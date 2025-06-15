// Meet John, a math teacher who created a program that takes a student's marks in five subjects as input, calculates the total marks and percentage, and prints the results in Double variable. The maximum marks a student can score is 500.0 . The program accurately calculates the total marks and percentage for each


import java.util.Scanner;

public class MarksIn5Subjects {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      double s1 = sc.nextDouble();
      double s2 = sc.nextDouble();
      double s3 = sc.nextDouble();
      double s4 = sc.nextDouble();
      double s5 = sc.nextDouble();
    double maximumMark = 500.0;
    double totalMark = s1+s2+s3+s4+s5;
    double percentage = (totalMark*100)/maximumMark;
    System.out.println(totalMark);
    System.out.println(percentage);
    sc.close();
  }
}


// 10
// 10
// 10
// 10
// 10
// 50.0
// 10.0