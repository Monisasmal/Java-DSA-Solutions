// You have given an array of integers of length n and a key. you need to find the last index of the key in the given array . If not present, then return -1.

// Input Format

// First line consists of an integer n.

// Second line consists of an array of integers of size n.

// Third line consists an integer key.


package Page20;

import java.util.Scanner;

public class PrintLastIndexOfxInArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    for(int i = n-1; i>0; i--){
      if(arr[i] == target){
        System.out.println(i);
        sc.close();
        return;
      }
    }
    System.out.println(-1);
    sc.close();;
  }
}

// O/P-->
// 5

// 1 2 3 4 4
// 4

// 4
