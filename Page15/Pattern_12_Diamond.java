// Take Integer N as input and print the following pattern.


package Page15;

import java.util.Scanner;

public class Pattern_12_Diamond {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tr = 2*n-1;
    int spc = n-1;
    int str = 1;
    for(int i = 1; i<=tr; i++){
      for(int j =1; j<=spc; j++){
        System.out.print(" ");
      }for(int k =1; k<=str; k++){
        System.out.print("*");
      }
      System.out.println();
      if(i<n){
        spc--;
        str += 2;
      }else{
        spc++;
        str -= 2;
      }
    }
    sc.close();
  }
}

// O/P-->
// 6
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
