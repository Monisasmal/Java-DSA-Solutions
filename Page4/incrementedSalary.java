// Take in three inputs age, salary, experience, then

// a. If age is greater than 60 and salary is greater than 20,000 and experience is greater than 20 years, then add 5000 to the salary.

// b. If age is greater than 40 and salary is greater than 15,000 and experience is greater than 10 years, then add 2000 to the salary.

// c. If age is greater than 30 and salary is greater than 10,000 and experience is greater than 5 years, then add 1000 to the salary.

// d. Otherwise add 500 to the salary.

// In the end Print the final salary.


import java.util.Scanner;

public class incrementedSalary {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    int salary = sc.nextInt();
    int experience = sc.nextInt();
    if( age > 60 && salary > 20000 && experience > 20){
      System.out.println(salary += 5000);
    }else if(age > 40 && salary > 15000 && experience > 10){
      System.out.println("salary += 2000");
    }else if(age > 30 && salary > 10000 && experience > 5){
      System.out.println("salary += 1000");
    }else{
      System.out.println(salary += 500);
    }
    sc.close();
  }
}

// O/P-->
// 65
// 25000
// 25
// 30000

// 30
// 15000 
// 7
// 15500
