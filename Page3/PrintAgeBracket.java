// You will be given age as an integer input from the user, and print according to the conditions given below

// a. Print Super Senior Citizen if age is equal to or above 70.

// b. Print Senior Citizen if age is below 70 but equal to or above 59.

// c. Print Adult if age is below 59 but equal to or above 18.

// d. Print Underage is age is below 18 but above 1.

// e. Print New Born if none of the above conditions follow.

// Input Format

// For each test case, you will be given age as an integer in an integer data-type.

import java.util.Scanner;


public class PrintAgeBracket {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age >= 70){
      System.out.println("Super Senior Citizen");
    }
    else if(age < 70 && age >= 59){
      System.out.println("Senior Citizen ");
    }
    else if(age < 59 && age >=18){
      System.out.println("Adult ");
    }
    else if(age < 18 && age >= 1){
      System.out.println("Underage ");
    }
    else{
      System.out.println("New Born");
    }
    sc.close();
  }
}

// O/P-->
// 17
// Underage 
