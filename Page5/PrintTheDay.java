// Write a Java program that prompts the user to enter a number between 1 and 7 (inclusive) that represents a day of the week. The program should then use a switch statement to output the corresponding name of the day of the week.

// for 1 output is Monday , for 2 output is Tuesday and so on.

package Page5;

import java.util.Scanner;

public class PrintTheDay {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int weekDay = sc.nextInt();
    String dayName;
    switch(weekDay){
      case 1: dayName = "Monday"; break;
      case 2: dayName = "TuesDay"; break;
      case 3: dayName = "WednesDay"; break;
      case 4: dayName = "ThrusDay"; break;
      case 5: dayName = "Friday"; break;
      case 6: dayName = "SaturDay"; break;
      case 7: dayName = "Sunday"; break;
      default: dayName = "InvalidDay"; break;
    } 
    System.out.println(dayName);
    sc.close();
  }
}

// O/P-->
// 1
// Monday
