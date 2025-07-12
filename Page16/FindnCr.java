// Given two Integer n and r , find the value of nCr .

// Since the answer may be very large, calculate the answer modulo 10^9+7.

// Input Format

// The first line contains an Integer n.

// The second line contains an Integer r.

package Page16;

import java.util.Scanner;

public class FindnCr {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int nFact =   getFact(n);
    int rFact = getFact(r);
    int ncrFact = getFact(n-r);
    System.out.println(nFact/(rFact*ncrFact));
    sc.close();
  }
  public static int  getFact(int x){
    int ans  = 1;
    for(int i = 1; i<=x; i++){
      ans *= i;
    }
    return ans;
  }
}

// O/P-->
// 3
// 2

// 3
