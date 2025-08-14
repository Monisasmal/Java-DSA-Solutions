// Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.

// Input Format

// First line contains integer N

// Second line contains N integer representing elements of array.

// Third line contains an integer.


package Page20;

import java.util.Scanner;

public class CheckIfXisPresentInArrayOrNot {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    for(int i = 0; i<n; i++){
      if(arr[i] == target){
        System.out.println("True");
        sc.close();
        return;
      }
    }
    System.out.println("False");
    sc.close();
  }
  
}

// O/p-->
// 5
// 1 2 3 4 5 
// 6
// False
