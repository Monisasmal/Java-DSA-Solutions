// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// For each index print the sum of all the elements except the element present at that index..

// Input Format

// First line consists N as Size of Array.

// Second line consists N Int value as Arr[i] values

package Page21;

import java.util.Scanner;

public class PrintSumofElementsExceptItself {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int total = 0;
    for(int i =0; i<n; i++){
      total += arr[i];
    }
    for(int i =0; i<n; i++){
      int result = total - arr[i];
      System.out.println(result);
    }
    sc.close();
  }
}

// O/P-->
// 4

// 2
// 7
// 8
// 9

// 24
// 19
// 18
// 17
