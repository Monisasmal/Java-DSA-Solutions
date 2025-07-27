// Take n as an integer input. Declare an array of size n that stores value of int data-type.

// Then take n integer inputs and store them in the array one by one.

// And print each integer in each line.

// Input Format

// first line contains integer N as size of array.

// Second line contains N integers representing size of array.

package Page18;

import java.util.Scanner;

public class PrintTheArrayElements {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
      System.out.println(arr[i]);
    }
    sc.close();
  }
}

// O/P-->
// 6

// 1
// 1
// 2
// 2
// 3
// 3
// 4
// 4
// 5
// 5
// 6
// 6
