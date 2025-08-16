// Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Traverse the array from the last and print the index at which the consonant occurs for the first time.

// Input Format

// First line consists N as size.

// Second line consists an array of N char Values


package Page20;

import java.util.Scanner;

public class FirstOccuranceOfConsonantFromEnd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   char[] arr = new char[n];
   for(int i = 0; i<n; i++){
            arr[i] = sc.next().charAt(0);
   }
   for(int i = n-1; i>=0; i--){
            if(isConsonant(arr[i])){
            System.out.println(i);
            sc.close();
            return;
            }
        }
        sc.close();
  }
  public static  boolean isConsonant(char ch){
       
        return ch != 'a'&& ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
    }
}

// O/P-->
// 5 

// a
// b
// c
// d
// q

// 4
