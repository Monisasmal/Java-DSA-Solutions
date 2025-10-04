// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Print the minimum amongst all the elements of the array.

// Input Format

// First line consists N as Size of Array

// Second line consists N Integer value as Arr[i] values

package Page21;
import java.util.Scanner;
public class MinimumInArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] =  new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int minArr = arr[0];
    for(int i = 0; i<n; i++){
      if(arr[i] < minArr){
        minArr = arr[i];
      }
    }
    System.out.println(minArr);
    sc.close();
  }
}

// O?p-->
// 5 

// 10
// 4 
// 9 
// 55
// 21

// 4
