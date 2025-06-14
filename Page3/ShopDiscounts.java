// A shop will give a discount of 10% on the total cost if the cost of the quantity purchased is more than 1000. a. Ask user for the number of units b. Suppose, one unit will cost 100. c. Judge and print total cost for the user in the integer format.

import java.util.Scanner;

public class ShopDiscounts{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Quantity = sc.nextInt();
    int totalAmount = Quantity * 100;
    if(totalAmount > 1000){
      totalAmount -= (totalAmount * 0.10);
    }
    System.out.println(totalAmount);
    sc.close();
  }
}

// O/P-->
// 15
// 1350