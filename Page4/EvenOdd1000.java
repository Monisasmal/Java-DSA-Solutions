// Once upon a time, there was a program that asked the user to enter an integer. The program was designed to behave differently based on whether the integer was even or odd.

// If the integer was even, the program checked if it was greater than 1000. If it was, the program printed Even and above 1000. If it wasn't, the program simply printed Even.

// On the other hand, if the integer was odd, the program also checked if it was greater than 1000. If it was, the program printed Odd and above 1000. If it wasn't, the program printed Odd.

import java.util.Scanner;

public class EvenOdd1000 {
  public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  int x = sc.nextInt();
  if(x % 2 == 0){
   if(x > 1000){
    System.out.println("Even and above 1000");
   }
   else{
    System.out.println("Even");
   }
  }else{
    if(x > 1000){
      System.out.println("Odd and above 1000");
    }else{
      System.out.println("Odd");
    }
  }
  sc.close();
}
}

// O/P -->
// 1002
// Even and above 1000
