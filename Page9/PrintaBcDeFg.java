// Print a, B, c, D, e, F, g...... 26 characters where each character should be printed in a separate line.

// Input Format

// No input will be given


package Page9;

import java.util.Scanner;

public class PrintaBcDeFg{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  char lowerCase = 'a';
  char upperCase = 'B';
  for(int i = 0; i<26; i++){
    if(i%2 == 0){
      System.out.println(lowerCase);
      lowerCase+=2;
    }else{
      System.out.println(upperCase);
      upperCase+=2;
    }
  }
  sc.close();
}
}

// O/P-->
// a
// B
// c
// D
// e
// F
// g
// H
// i
// J
// k
// L
// m
// N
// o
// P
// q
// R
// s
// T
// u
// V
// w
// X
// y
// Z