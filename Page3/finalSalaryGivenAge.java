// The government adds money into the account of a person based on his age. Take age and salary of the person as integer inputs. And print his final income as an integer data-type output.

// a. if age is above 60*, Rs. 1000 is added into the account.

// b. if age is above 40 and less than or equal to 60, Rs. 500 is added.

// c. No money is added if the age is less than or equal to 40.

// Input Format

// For each test case, Age of the person in the first line.

// Salary of the person in the second line.

import java.util.Scanner;

public class finalSalaryGivenAge {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    int salary = sc.nextInt();
    if(age > 60){
      System.out.println(salary += 1000);
    }
    else if(age > 40 && age <= 60){
      System.out.println(salary += 500); 
    }
    else if(age <= 40){
       System.out.println("No money is added");
    }
    sc.close();
  }
}

// O/P -->
// 45
// 20000
// 20500
