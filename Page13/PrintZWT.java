// Write a Program using while loop for printing z, w, t… alphabets using a while loop, where the last alphabet printed should be greater than or equal to d.

// Input Format

// No Input

package Page13;
public class PrintZWT {
  public static void main(String args[]){
    for(char ch = 'z'; ch>='d'; ch-=3){
      System.out.println(ch + " ");
    }
   
  }
}

// O/P-->
// z 
// w 
// t 
// q 
// n 
// k 
// h 
// e
