// Take an array arr of size N as input which represents a large number.

// Add 1 (one) to this large number and print the resultant array.

// eg:- [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,7]

// Note: The large integer does not contain any leading 0's in the array.

// Input Format

// First line contains an integer N, which is the size of the array.

// Second line contains N integers, depicting the elements of the array.


package Page22;

import java.util.Scanner;

public class AddOne {
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i =0; i<n; i++){
    arr[i] = sc.nextInt();
  }
  addOne(arr);
  sc.close();
 } 
 public static void addOne(int[] arr){
  int carry = 1;
  int n = arr.length;
  int ans[] = new int[n];
  for(int i = n-1; i>=0; i--){
     int sum = arr[i] + carry;
     int d = sum % 10;
     carry = sum/10;
     ans[i] = d;
  }
  if(carry > 0) System.out.print(carry+" ");
  for(int result: ans) System.out.print(result + " ");
 }
}

// O/P-->
// 1
// 9
// 1 0 
