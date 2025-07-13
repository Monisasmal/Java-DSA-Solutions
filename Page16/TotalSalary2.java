// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

//    totalSalary = basic + hra + da + allow – pf
//         where :
// hra   = 20% of basic

// da    = 50% of basic

// allow = 1700 if grade = ‘A’

// allow = 1500 if grade = ‘B’

// allow = 1300 if grade = ‘C' or any other character

// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.

// Note: use functions.


package Page16;

import java.util.Scanner;

public class TotalSalary2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    char grade = sc.next().charAt(0);
     System.out.println(totalSalary(salary, grade));
    sc.close();
  }
  
  public static int totalSalary(int salary, char grade){
    double hra = 0.20 * salary;
    double da = 0.50 * salary;
    double pf  = 0.11 * salary;
    double allow;
    if(grade == 'A'){
      allow = 1700;
    }else if(grade == 'B'){
      allow = 1500;
    }else{
      allow = 1300;
    }
    double tSalarys = salary+hra+da+allow - pf;
    return (int) Math.round(tSalarys);
  }

}

// O/P-->
// 10000
// A
// 17600
