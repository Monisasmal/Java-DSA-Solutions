// Take n as an integer input from the user, after this n integer inputs will be given by the user. And for each integer input,you have to print prime if the integer in a prime number and not prime is the integer is not a prime number.

// Input Format

// For each case, n will be given as an integer input in the first line.

// After this n integer numbers will be given as


package Page18;

import java.util.Scanner;

public class PrintPrimeOrNotPrime {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T > 0){
      int n = sc.nextInt();
      System.out.println(isPrime(n) ? "Prime" : "not Prime");
      T--;
    }
    sc.close();
  }
  public static boolean isPrime(int n){
    for(int i = 2; i<n; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }
}

// O/P-->
// 2

// 31
// Prime

// 54
// not Prime
