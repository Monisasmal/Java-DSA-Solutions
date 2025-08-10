// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array from the starting which are even.


package Page19;
import java.util.Scanner;
public class PrintEvenArrayElementsinline {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      if(arr[i] % 2 == 0){
        System.out.println(arr[i] + " ");
      }
    }
    sc.close();
  }
}

// O/P-->
// 4

// 10
// 20
// 13
// 23

// 10 
// 20 
