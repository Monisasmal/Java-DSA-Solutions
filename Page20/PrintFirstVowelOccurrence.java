// Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Print the index at which the vowel occurs for the first time.

// Input Format

// First line consists of an integer value N.

// Second line consits of an array with N characters.

package Page20;

import java.util.Scanner;

public class PrintFirstVowelOccurrence {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char arr[] = new char[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.next().charAt(0);
    }
    for(int i=0; i<n; i++){
      if(isVowel(arr[i])){
        System.out.println(i);
        sc.close();
        return;
      }
    }
    sc.close();
  }
  public static boolean isVowel(char ch){
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
}

// O/P-->
// 5

// b
// c
// d
// e
// p

// 3
