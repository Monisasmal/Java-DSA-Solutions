// Take in a ch as a character input from the user, and print You are a male if M or m is taken as input. And print You are a female if F or f is taken as input. And if some other character is taken as an input, then print Type again.


package Page6;
import java.util.Scanner;
public class MaleOrFemale {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char gender = sc.next().charAt(0);
    if(gender == 'M' || gender == 'm') System.out.println("You are a male ");
    else if(gender == 'F' || gender == 'f') System.out.println("You are a female");
    else System.out.println("Type again"); 
    sc.close();
  }
}

// O/P-->
// F
// You are a female