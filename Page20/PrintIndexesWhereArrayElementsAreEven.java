// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the indexes of the array from the starting where the elements are even.

package Page20;
import java.util.Scanner;
public class PrintIndexesWhereArrayElementsAreEven {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i  =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0){
        System.out.println(i + " ");
      }
    }
    sc.close();
  }
}

// O/P-->
// 5

// 11
// 12
// 13
// 14
// 15

// 1 
// 3 
