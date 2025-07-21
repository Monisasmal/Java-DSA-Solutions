// Take two integer inputs x and y. Then print the gcd of these two numbers as an integer output.

// Input Format

// T will be given as an integer input representing the number of test cases.

// For each test case,

// x will be given as an integer input in the first line,

// y will be given as an integer input in the second line.

package Page18;

import java.util.Scanner;

public class GCD3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(gcd(x,y));
      t--;

    }
    sc.close();
  }
  public static int gcd(int x, int y){
    int min = x < y ? x : y;
    for(int i = min; i>=2; i--){
       if((x % i == 0) && (y % i == 0)){
        return i;
       }
    }
    return 1;
  }
}

// O/P-->
// 2
// 100 35
// 5
// 20 7
// 1

// Dry run

// Dry run of GCD for x = 8, y = 12
// min = 8
// Checking from i = 8 down to 2...

// Checking i = 8
// x % i = 0 → Yes
// y % i = 4 → No
// ❌ Not divisible by both, continue...

// Checking i = 7
// x % i = 1 → No
// y % i = 5 → No
// ❌ Not divisible by both, continue...

// Checking i = 6
// x % i = 2 → No
// y % i = 0 → Yes
// ❌ Not divisible by both, continue...

// Checking i = 5
// x % i = 3 → No
// y % i = 2 → No
// ❌ Not divisible by both, continue...

// Checking i = 4
// x % i = 0 → Yes
// y % i = 0 → Yes
// ✅ Both are divisible by 4, so GCD is 4

