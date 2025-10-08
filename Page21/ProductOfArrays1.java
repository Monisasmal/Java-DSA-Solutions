// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Print Product of all the elements of arrays

// Input Format

// First line contains N as Size of Array.

// Second line contains n integer value as Arr[i] values

package Page21;
import java.util.Scanner;
public class ProductOfArrays1 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int product = 1;
    for(int i = 0; i<n; i++){
      product *= arr[i];
    }
    System.out.println(product);
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

// 120
