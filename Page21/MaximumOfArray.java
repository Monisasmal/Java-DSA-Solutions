// For the given array having N elements, find the maximum element of the array.

// Input Format

// First line will be N, no of elements.

// Second line contains N elements representing an array

package Page21;
import java.util.Scanner;
public class MaximumOfArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int maxArr = arr[0];
    for(int i = 1; i<n; i++){
      if(arr[i]>maxArr){
        maxArr = arr[i];
      }
    }
    System.out.println(maxArr);
    sc.close();
  }
}

// O/P-->
// 5

// 1 2 3 4 5  

// 5
