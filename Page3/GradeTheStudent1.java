// You are given marks of a student as an integer input. You need to print according to the following rules: 1 for marks above 90, print excellent. 2 for marks above 80 and less than equal to 90, print good. 3 for marks above 70 and less than equal to 80, print fair. 4 for marks above 60 and less than equal to 70, print meets expectations. 5 for marks above 40 and less than equal to 60, print below par. 6 print failed if none of the above conditions follow.


import java.util.Scanner;

public class GradeTheStudent1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    if(marks > 90){
      System.out.println("excellent");
    }else if(marks > 80 && marks <= 90){
      System.out.println("good");
    }else if(marks > 70 && marks <= 80){
      System.out.println("fair");
    }else if(marks > 60 && marks <= 70){
      System.out.println("expectations");
    }else if(marks > 40 && marks <= 60){
      System.out.println("below par");
    }else{
      System.out.println("failed ");
    }
    sc.close();
  }
}


// O/P-->
// 69
// expectations

