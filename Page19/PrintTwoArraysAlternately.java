// Take n as an integer input. Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Declare the second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print the elements as explained below

// Print the first element of the first array present at the 0th index, then the element of the second array at the 1st index, then the element of the first array at the 2nd index, then the element of the second array at the 3rd index, so on and so forth.

// Input Format

// First line contains integer N as size of arrays.

// Second line contains N integers representing elements of first array.

// Third line contains N integers representing elements of Second array.

package Page19;
import java.util.Scanner;
public class PrintTwoArraysAlternately {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr1 = new int[n];
    for(int i = 0; i<n; i++){
      arr1[i] = sc.nextInt();
    }
    int arr2[] = new int [n];
    for(int i = 0; i<n; i++){
      arr2[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(i % 2 == 0){
        System.out.println(arr1[i]);
      }
      else{
       System.out.println(arr2[i]);
      }
    }
    sc.close();
  }
}

// O/P-->
// 3

// 1
// 2
// 3
// 4
// 5
// 6

// 1
// 5
// 3
