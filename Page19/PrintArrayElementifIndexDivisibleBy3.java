// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array where the index is divisible by 3

// Input Format

// First line contains integer N as size of array.

// Second line contains N integers representing size of array.

package Page19;
import java.util.Scanner;
public class PrintArrayElementifIndexDivisibleBy3 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i =0; i<n; i++){
      if(i % 3 == 0){
        System.out.println(arr[i] + " ");
      }
    }
    sc.close();
   }
}

// O/P-->
// 5

// 1
// 2
// 3
// 4
// 5

// 1 
// 4
