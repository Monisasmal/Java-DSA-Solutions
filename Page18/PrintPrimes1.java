// You are given two integer inputs x and y. Make a function that takes in x and y as parameters. Then print all the prime numbers which lie between x and y (x and y both inclusive and y>x).

// Input Format

// First line take an Integer input from user as x.

// Second line take an Integer input from user as y.

package Page18;

import java.util.Scanner;

public class PrintPrimes1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    for(int i = x; i<=y; i++){
      if(isPrime(i)){
        System.out.println(i + " ");
      }
    }
    sc.close();
  }
  public static boolean isPrime(int n){
     for(int j = 2; j < n; j++){
     if(n % j == 0){
      return false;
     }
     }
     return true;
    }
}

// O/P-->
// 10
// 20

// 11 
// 13 
// 17 
// 19 
