// For each index,

// Store 1 at that index if the element at that index is greater than zero.

// Store 0 at the index if the element at that index is equal to zero.

// Store -1 at the index if the element at that index is less than zero.

// In the end print the complete array one by one.

// Input Format

// First line contains a number n representing size of array

// Second line contains N numbers representing elemnts of array.

package Page22;
import java.util.Scanner;
public class CheckCharacterstic {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] < 0) arr[i] = -1;
      else if(arr[i] == 0) arr[i] = 0;
      else arr[i] = 1;
    }
    for(int ele : arr){
      System.out.print(ele + " ");
    }
    sc.close();
  }
}

// O/P-->
// 5
// -12 23 0 12 -19
// -1 1 0 1 -1 
