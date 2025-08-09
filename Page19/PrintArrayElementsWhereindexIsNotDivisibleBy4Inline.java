// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array where the index is not divisible by 4.


package Page19;

import java.util.Scanner;

public class PrintArrayElementsWhereindexIsNotDivisibleBy4Inline {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int[] arr = new int[n];
    for(int i = 0; i<n; i++){
     arr[i] = sc.nextInt();
    }
    for(int i =0; i<n; i++){
      if(i % 4 != 0){
        System.out.println(arr[i] + " ");
      }
    }
    sc.close();
  }
}

// O/p-->
// 5
// 1 2 3 7 10
// 2 
// 3 
// 7 
