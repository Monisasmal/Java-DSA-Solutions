// Take an array arr of size N as input which represents a large number. Add X to this large number and print the resultant array.

// eg:-for X = 2 and array is [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,8]

// Note: The large integer does not contain any leading 0's in the array.

// Input Format

// First line contains an integer N representing the length of array.

// Second line contains N integers representing the elements of array.

// Third line contains an integer X .

package Page22;

import java.util.Scanner;

public class calculator36 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    calculate36(arr,x);
    sc.close();
  }
  public static void calculate36(int[] arr, int x){
    int carry = x;
    int n = arr.length;
    int[] ans = new int[n];
    for(int i = n-1; i>=0; i--){
      int sum = arr[i] +  carry;
      int d = sum % 10;
      carry = sum / 10;
      ans[i] = d;
    }
    if(carry > 0) System.out.print(carry + " ");
     for(int result : ans) System.out.print(result + " ");
  }
}

// O/P-->
// 10
// 1 8 7 5 2 2 9 3 7 4
// 9
// 1 8 7 5 2 2 9 3 8 3 
