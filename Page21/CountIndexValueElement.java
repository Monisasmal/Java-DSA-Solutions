// Given an integer n, the task is to define an array arr[] of size n &

// Print the count of element whose value is equal to its index value,

// For Ex:- if the value, "4" is present at arr[4] , therefore it would qualify as an element whose value is equal to its index value.

// Input Format

// An integer n, which is the size of the array arr[]

// n integers each in a new line, depicting the elements of the array arr[]


package Page21;
import java.util.Scanner;
public class CountIndexValueElement {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=  sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for(int i =0; i<n; i++){
      if(arr[i] == i){
        count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}

// O/P-->
// 5

// 4
// 1
// 5
// 3
// 5

// 2
