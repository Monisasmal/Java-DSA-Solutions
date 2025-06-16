// Once upon a time, there was a program that took three integers (x, y, z) as input from the user. Depending on the value of x, the program would perform different operations on the value of z.

// If x was divisible by 3, the program checked the value of y.

// If y was greater than or equal to 200, the program added 10 to the value of z.

// If y was greater than or equal to 100 but less than 200, the program added 5 to the value of z.

// If y was greater than or equal to 50 but less than 100, the program added 4 to the value of z.

// If y was less than 50, the program added 1 to the value of z.

// On the other hand, if x was not divisible by 3, the program also checked the value of y.

// If y was greater than or equal to 200, the program added 3 to the value of z.

// If y was greater than or equal to 100 but less than 200, the program added 2 to the value of z.

// If y was less than 100, the program added 1 to the value of z.

// Finally, the program added 10 to the value of z and printed the final value of z.

// Can you write a program to perform these operations using your programming skills?

// Input Format

// For each test case, You get the value of x in the first line as an integer input

// You get the value of y in the second line as an integer input

// You get the value of z in the third line as an integer input


package Page5;

import java.util.Scanner;

public class ZandXdivisibleBy3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x % 3 == 0){
      if(y >= 200) z += 10;
      else if(y >= 100 && y < 200) z+= 5;
      else if(y >= 50 && y < 100) z += 4;
      else if(y < 50) z += 1; 
    }else{
      if(y >= 200) z += 3;
      else if(y >= 100 && y < 200) z += 2;
      else if(y < 100) z += 1;
    }
    System.out.println(z += 10);
    sc.close();
  }
}

// O/P-->
// 30
// 300
// 5
// 25
