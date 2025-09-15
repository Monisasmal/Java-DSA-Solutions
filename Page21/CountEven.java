// Given an integer n, the task is to define an integer array arr[] of size n &

// Print the Count / Number of even elements in the array.

// Input Format

// An integer n, which is the size of the array arr[]
// n integers each in a new line, depicting the elements of the array arr[]

package Page21;
import java.util.Scanner;
public class CountEven {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}

// O/P-->
// 5

// 2
// 3
// 4
// 2
// 8

// 4
