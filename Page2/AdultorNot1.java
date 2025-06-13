// You will be given the age of a person as an integer input, you need to print "Adult" if the age is greater than or equal to 18 and print “Below age” if the age is below 18.

import java.util.Scanner;

public class AdultorNot1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x >= 18){
      System.out.println("Adult");
    }else{
      System.out.println("Below Age");
    }
    sc.close();
  }
}


// O/P_>
// 24
// Adult