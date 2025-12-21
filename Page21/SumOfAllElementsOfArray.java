// You are given an array, and you have to calculate the sum of all elements in the array.

// Input Format

// First line consists of size of array n.

// Second line consists Elements of array (seperated by space).


package Page21;
import java.util.Scanner;
public class SumOfAllElementsOfArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i = 0; i<n; i++){
     sum += arr[i];
    }
    System.out.println(sum);
    sc.close();
  }
}

// O/P-->
// 3
// 4 2 1
// 7
