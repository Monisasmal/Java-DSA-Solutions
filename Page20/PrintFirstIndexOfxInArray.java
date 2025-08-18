// You have given array of n elements and key . you need to find the first index in the array . If key does not exist then return -1.

// Input Format

// First Line consists of an integer n.

// Second Line consists of n integers representing an array.

// Third line consists of a key.

package Page20;
import java.util.Scanner;
public class PrintFirstIndexOfxInArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    for(int i =0; i<n; i++){
      if(arr[i] == target){
        System.out.println(i);
        sc.close();
        return;
      }
    }
    System.out.println(-1);
    sc.close();
  }
}

// O/P-->
// 5

// 1 2 3 3 3
// 3

// 2
