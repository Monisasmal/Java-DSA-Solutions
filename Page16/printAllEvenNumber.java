
// Take x and y as input. Write a function that takes in x and y as integer parameters and prints all the even numbers between x and y (x and y both inclusive)

// Input Format

// Take integer T as an integer input which represents the number of testcases.

// for each test cases:-

// first line take an integer input from user as x.

// second line take an integer input from user as y.


package Page16;

import java.util.Scanner;

public class printAllEvenNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      int x = sc.nextInt();
      int y = sc.nextInt();
     evenNumber(x,y);
     n--;
    }
    sc.close();
  }
  public static void evenNumber(int x, int y){
    for(int i = x; i<=y; i++){
      if(i%2 == 0){
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}

// O/P-->
// 2
// 10 100
// 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
// 20 200
// 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 102 104 106 108 110 112 114 116 118 120 122 124 126 128 130 132 134 136 138 140 142 144 146 148 150 152 154 156 158 160 162 164 166 168 170 172 174 176 178 180 182 184 186 188 190 192 194 196 198 200
