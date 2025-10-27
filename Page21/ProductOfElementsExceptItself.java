// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// For each index print the product of all the elements except the element present at that index..

// Input Format

// First line contains integer N as Size of Array.

// Second line contains N integer value as Arr[i] values

package Page21;
import java.util.Scanner;
public class ProductOfElementsExceptItself{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int result[] = productItself(arr);
    for(int i = 0; i<result.length; i++){
      System.out.println(result[i]);
    }
    sc.close();
  }
  public static int[] productItself(int[] arr){
    int n = arr.length;
    int[] result = new int[n];
    int prefix = 1;
    for(int i =0; i<n; i++){
      result[i] = prefix;
      prefix *= arr[i];
    }
    int surfix = 1;
    for(int i = n-1; i>=0; i--){
     result[i] *= surfix;
     surfix *= arr[i];
    }
    return result;
    
  }
}

// O/P-->
// 3

// 2
// 5
// 3

// 15
// 6
// 10
