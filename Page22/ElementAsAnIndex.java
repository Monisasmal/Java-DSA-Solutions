// Construct an array called "ans" that has the same length as the "nums" array, which is indexed starting at 0. Each element in "ans" should be assigned with the value of "nums[nums[i]]". Finally, return the "ans" array.

// Note: nums is an array of distinct integers from 0 to nums.length - 1

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer inputs representing elements of array.

package Page22;

import java.util.Scanner;

public class ElementAsAnIndex {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int[] ans = new int[n];
    for(int i = 0; i<n; i++){
      ans[i] = arr[arr[i]];
    }
    for(int i =0; i<ans.length; i++){
      System.out.print(ans[i] + " ");
    }
    sc.close();
  }
}
// O/P-->
// 6
// 0 2 1 5 3 4
// 0 1 2 4 5 3 
