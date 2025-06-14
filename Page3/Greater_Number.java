// Tom is a junior developer who is working on a programming project. One of his tasks involves creating a program that takes two integer inputs, compares them, and prints the greater value. If both values are the same, the program should output either one.

// To accomplish this task, Tom began by writing a code that prompts the user to input two integer values and stores them in separate variables. He then created a conditional statement that compares the two values to determine which one is greater. If the first value is greater than the second, the program outputs the first value. If the second value is greater, the program outputs the second value. If both values are equal, the program outputs either one.


import java.util.Scanner;

public class Greater_Number {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int second = sc.nextInt();
    int result = (first >= second) ? first : second;
    System.err.println(result);
    sc.close();
  }
}

// // O/P-->
//  first - 34
// second - 67
// 67
