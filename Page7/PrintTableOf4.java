package Page7;
import java.util.Scanner;
public class PrintTableOf4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = 4;
   for(int i= 1; i<= 10; i++){
    int result =  n*i;
    System.out.println(n + "X" + i + "=" + result);
   }
   sc.close();
  }
}
