package Page20;

import java.util.Scanner;

public class PrintAllCompositeNumberofArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      int num = arr[i];
      if(num < 3){
        continue;
      }
      boolean isComposite = false;
      for(int j = 2; j<= num/2; j++){
       if(num % j == 0){
        isComposite = true;
        break;
       }
      }
       if (isComposite) {
                System.out.println(num);
            }
    }
    sc.close();
  }
}

// O/P-->
// 6 
// 1 2 3 4 5 6
// 4
// 6
