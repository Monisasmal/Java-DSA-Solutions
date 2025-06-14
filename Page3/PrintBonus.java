// The bonus in a company is given by Bonus= Salary * (5 / 100). A company decided to give a bonus of 5% to employees if his/her years of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount. If the years of service is less than or equal to 5, print 0, otherwise print Bonus calculated.


import java.util.Scanner;

public class PrintBonus {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int salary = sc.nextInt();
    int yearOfService = sc.nextInt();
    if(yearOfService > 5){
      double Bouns =  (salary * 0.05);
      System.err.println((int)Bouns);
    }else{
      System.err.println(0);
    }
    sc.close();
  }
}

// O/P-->
// 20000
// 6
// 1000
