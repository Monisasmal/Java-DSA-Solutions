// Take N as an integer input. Declare an array of size N that stores value of int data-type. Then take N integer inputs and store them in the array one by one.

// Then print the elements of the array from the last index till the 0th index such that each element is printed one by one in each line

// Input Format

// First line contains integer N as size of array.

// Second line contains N integers representing size of array.

package Page19;

import java.util.Scanner;

public class PrintArrayElementsReverse {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
       arr[i] = sc.nextInt();
    }
    for(int  i= n-1; i>=0; i--){
      System.out.println(arr[i] + " ");
    }
    sc.close();
  }
}

// O/P-->
// 3

// 1
// 2
// 3

// 3 
// 2
// 1 
