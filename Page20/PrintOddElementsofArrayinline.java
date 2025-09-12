// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array from the starting which are odd.

// Input Format

// First line contains an integer n representing length of the array.

// Second line consists n elements of an array.

package Page20;

import java.util.Scanner;

public class PrintOddElementsofArrayinline {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    sc.close();
  }
}

// O?p-->
// 6
// 1
// 2
// 3
// 5
// 6
// 8
// 1 3 5 
