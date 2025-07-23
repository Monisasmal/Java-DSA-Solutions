// Take x and y as integer inputs.

// Print all the Armstrong numbers in separate line which lie in the range x to y (both x and y inclusive)

// Use the function isArmstrong() which checks if a number is an Armstrong number or not and returns true or false accordingly.

// Input Format

// For each test case,

// x will be given in the first line

// y will be given in the second line.

package Page18;

import java.util.Scanner;

public class PrintArmstronginaRange {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  int y = sc.nextInt();
  for(int i = x; i<=y; i++){
    if(isArmstrong(i)){
      System.out.println(i);
    }
    sc.close();
  }
}

public static boolean isArmstrong(int n){
  int digit = 0;
  int temp = n;
  while(temp  != 0){
    temp /= 10;
    digit++;
  }
  int sum = 0;
  int result = n;
  while(result != 0){
   int digits = result%10;
   int power = 1;
   for(int i = 0; i<digit; i++){
     power *= digits;
   }
   sum += power;
   result /= 10;
  }
   return sum == n;
}
}

// O/P-->
// 50
// 500

// 153
// 370
// 371
// 407
