// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Start traversing the array from the last and Then print the index at which you find the first non-matching number in the array.

// Input Format

// First line Int Value N representing Size of array

// Second line contains N Integer values Representing the values of Arr1

// Third line contains N int values representaing the value of arr2

package Page20;

import java.util.Scanner;

public class FirstNONMatchingValueFromEnd {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n];
    for(int i = 0; i<n; i++){
      arr1[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int arr2[] = new int[m];
    for(int j = 0; j<m; j++){
      arr2[j] = sc.nextInt();
    }
    if(arr1.length != arr2.length){
            System.out.println("false");
            sc.close();
            return;
        }
    for(int i = arr1.length-1; i>=0; i--){
      if(arr1[i] != arr2[i]){
        System.out.println(i);
        sc.close();
        return;
      }
    }
    sc.close();
  }
}

// O/P-->
// 5
// 1 2 3 4 5
// 5
// 1 2 4 3 5
// 3
