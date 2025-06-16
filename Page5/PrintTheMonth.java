// Write a program that prompts the user to enter a month number (1-12) and uses a switch statement to display the name of the corresponding month. If the user enters an invalid number, the program should print Invalid Number.

// for 1 print January , for 2 print February and so on.

package Page5;

import java.util.Scanner;

public class PrintTheMonth {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    String monthName;
    switch(month){
      case 1: monthName = "January"; break;
      case 2: monthName = "February"; break;
      case 3: monthName = "March"; break;
      case 4: monthName = "April"; break;
      case 5: monthName = "May" ; break;
      case 6: monthName = "June"; break;
      case 7: monthName = "July"; break;
      case 8: monthName = "Augest"; break;
      case 9: monthName = "Septmber"; break;
      case 10:monthName = "October"; break;
      case 11: monthName = "Novemember"; break;
      case 12: monthName = "Decemember"; break;
      default: monthName = "Invalid Number"; break;
    }
    System.out.println(monthName);
    sc.close();
  }
}

// O/P-->
// 12
// Decemember
