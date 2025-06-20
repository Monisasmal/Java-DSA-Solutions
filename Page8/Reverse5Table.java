// You have to print the table of 5 in reverse as given below.

// Input Format

// No input needed.

package Page8;
public class Reverse5Table {
  public static void main(String args[]){
 
  int n = 5;
  for(int i = 10; i>=1; i--){
    int result = n * i;
    System.out.println("5X" + i + "=" + result);
   
  }
  }
}

// O/P-->
// 5X10=50
// 5X9=45
// 5X8=40
// 5X7=35
// 5X6=30
// 5X5=25
// 5X4=20
// 5X3=15
// 5X2=10
// 5X1=5
