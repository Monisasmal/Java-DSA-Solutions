// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the alternate elements of the array from the last index till the 0th index such that each element is printed one by one in the same line.

package Page19;

import java.util.Scanner;

public class PrintAlternateArrayElementsInReverseInline {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = n-1; i>=0; i-=2){
      System.out.println(arr[i] + " ");
    }
    sc.close();
  }
}

// O/P-->
// 5

// 10
// 20
// 30
// 40
// 50

// 50 
// 30
// 10
