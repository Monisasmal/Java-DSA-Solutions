// Once upon a time, there was a young programmer named Ben who was passionate about coding. One day, his mentor challenged him to write a program that would print the first N multiples of 11.

// Ben approached the problem by using a loop to iterate over the numbers and multiplying each number by 11 to generate the multiples. As the loop ran, he printed each multiple to the console, ensuring that only the first N multiples were printed.

// After a few attempts, Ben was able to complete the program successfully. He was thrilled to have solved the challenge and was proud of the new coding skills he had acquired.

// Input Format

// A single line take N as a input from user.

package Page8;
import java.util.Scanner;
public class PrintFirstNmultiplesOf11 {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    
    for(int i = 1; i<=n; i++){
     int result = 11*i;
     System.out.print(result + " ");
     sc.close();
    }
  }
}

// O/P->
// 10
// 11 22 33 44 55 66 77 88 99 110 
