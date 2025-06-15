// You are given the marks of a student as an integer input, the teacher gives 4 marks as grace marks if the marks of the student is less than 33, otherwise no grace marks are given. Print the final marks of the student.


import java.util.Scanner;

public class GraceMarks1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    int graceMark = 4;
    if(marks < 33){
      System.out.println(marks += graceMark); 
    }else{
      System.out.println("no grace marks");
    }
    sc.close();
  }
}

// O/P-->
// 20
// 24

// 56
// no grace marks
