// Take a whole number N as an integer input and then print all the unique prime factors of N such that each prime factor is printed in a separate line.

// Input Format

// Input contains an integer N.

package Page18;

import java.util.Scanner;

public class PrintAllUniquePrimeFactors {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    primeFactor(n);
    sc.close();
  }
  public static void primeFactor(int n){
    int divisor = 2;
    while(n>1){
      if(n % divisor == 0){
       System.out.println(divisor);
       while (n % divisor == 0) {
        n /= divisor;
       }
      }
      else{
        divisor++;
      }
    }
  }
}

// O/P-->
// 350
// 2
// 5
// 7
