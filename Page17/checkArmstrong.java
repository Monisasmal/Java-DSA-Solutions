// Take n as an integer input.

// Then write a function that takes in this n as an integer parameter and returns if n is an Armstrong number or not.

// In the end, print true or false accordingly.

// Note: An armstrong number is a number which is equal to the sum of the cube of its digits.

package Page17;

import java.util.Scanner;

public class checkArmstrong {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t>0) {
      int n = sc.nextInt();
      boolean Armstrong = isArmstrong(n);
      System.out.println(Armstrong);
      t--;
    }
    sc.close();
  }
  public static boolean isArmstrong(int n){
    int digit = 0;
    int temp = n;
    while(temp>0){
      temp = temp/10;
      digit++;
    }
    int sum = 0;
    int result = n;
    while(result>0){
      int digits = result % 10;
      int power = 1;
      for(int i = 0; i<digit; i++){
        power  *= digits;
      }
      sum += power;
      result /= 10;
    }
    return  sum == n;
    
  }
}

// O/P-->
// 2

// 153
// true

// 245
// false
