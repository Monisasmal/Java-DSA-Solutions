// Print z, Y, x, W, v…uptil 26 characters using a while loop.

// Input Format

// No input.

package Page13;
import java.util.Scanner;
public class PrintzYxWv {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char lowercase = 'z';
    char uppercase = 'Y';
    int i = 26;
    while(i>0){
      if(i%2 == 0){
        System.out.print(lowercase + " ");
        lowercase -= 2;
      }else{
        System.out.print(uppercase + " ");
        uppercase -= 2;
      }
      i--;
    }
    sc.close();
  }
}

// O/P-->
// z Y x W v U t S r Q p O n M l K j I h G f E d C b A 