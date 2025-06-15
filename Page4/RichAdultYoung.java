// Take the age and salary of a person as an integer input,

// If the age is above 40 then

// a. If the salary is greater than or equal to 30,000 then print You are rich and adult

// b. Else print You are an adult

// Else if age is less than or equal to 40

// a. If the salary is greater than or equal to 12,000, then print You are rich and young

// b. Else print You are young

import java.util.Scanner;
public class RichAdultYoung {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    int salary = sc.nextInt();
    if(age > 40){
      if(salary >= 30000){
        System.out.println("You are rich and adult");
      }else{
        System.out.println("You are an adult");
      }
    }else if(age <= 40){
      if(salary >= 12000){
        System.out.println("You are rich and young");
      }else{
        System.out.println("You are young");
      }
    }
    sc.close();
  }
}

// O/P-->
// 45
// 35000
// You are rich and adult
