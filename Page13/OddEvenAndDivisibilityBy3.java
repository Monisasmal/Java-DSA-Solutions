// Take n as an integer input. After this you will be given n numbers as integer inputs and you have to print each time if the number is Even or Odd. And Print “Divisible by 3” if the number is a multiple of 3 and print “Not Divisible by 3” if the number is not a multiple of 3

// Input Format

// N as an Integer Input

// N numbers as an Integer Input


package Page13;
import java.util.Scanner;
public class OddEvenAndDivisibilityBy3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
      int num = sc.nextInt();
      if(num %2 == 0){
        System.out.print("Even" + " ");
      }else{
        System.out.print("Odd" + " ");
      }
      if(num % 3 == 0){
        System.out.println("Divisible by 3");
      }else{
        System.out.println("Not Divisible by 3");
      }
     
    }
     sc.close();
  }
}

// O/p-->
// 3
// 6
// Even Divisible by 3
// 5
// Odd Not Divisible by 3
// 
// Even Not Divisible by 3
