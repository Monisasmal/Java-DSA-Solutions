// Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print true if the arrays are equal and print false if the array is not equal.

// Definition of Equal Arrays: Arrays whose size is equal and whose elements at the corresponding indexes are the same

// Input Format

// A number n denoting array1 size

// n numbers representing elements of array1

// A number m denoting array2 size

// m numbers representing elements of array2


package Page19;

import java.util.Scanner;

public class CheckIfTwoArraysAreIdentical {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j = 0; j<m; j++){
            arr2[j] = sc.nextInt();
        }
        if(arr1.length != arr2.length){
            System.out.print("false");
            sc.close();
               return;
        }
            
    
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.print("false");
                sc.close();
                   return;
            }
          
        }
         System.out.println("true"); 
         sc.close();
  }
  
}

// O/P-->
// 3
// 1 2 3
// 3
// 1 
// 2 3
// true
