// For each index,

// Add 1 to the value stored at that index if the element at that index is greater than zero.

// Add 2 to the value at the index if the element at that index is equal to zero.

// Add 3 to the value at the index if the element at that index is less than zero.

// In the end print all the elements of the array such that each element is printed in a separate line.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n numbers representing elements of the array.

package Page22;
import java.util.Scanner;
public class PerformOperations1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] > 0) arr[i] += 1;
      else if(arr[i] < 0) arr[i] += 3;
      else arr[i] += arr[i] += 2;
    }
    for(int result : arr){
      System.out.print(result + " ");
    }
    sc.close();
  }
}

// O/P-->
// 3
// -3 0 3
// 0 2 4 
