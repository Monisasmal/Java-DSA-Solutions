// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

// If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)

// Input Format

// The first line contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.

package Page21;
import java.util.Scanner;
public class SecondLargestInArray2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=1){
      System.out.println(-2147483648);
      sc.close();
      return; 
    }
    int largest = sc.nextInt();
    int secLargest = sc.nextInt();
    if(largest < secLargest){
     int temp = largest;
     largest = secLargest;
     secLargest = temp;
    }
    for(int i = 2; i<n; i++){
     int num = sc.nextInt();
     if(num>largest){
      secLargest = largest;
      largest = num;
     }else if(num > secLargest && num<largest){
      secLargest = num;
     }
    }
    if(largest == secLargest){
      System.out.println(-2147483648);
    }else{
      System.out.println(secLargest);
    }
    sc.close();
  }
}

// O/P-->
// 7
// 2 13 4 1 3 6 28
// 13
