// You will be given two integers x and y. You have to print the sum of x and y in the first line, and the difference of x and y in the second line.

// First integer input should be stored in x, Second integer input should be stored in y.

import java.util.Scanner;

public class SumAndDiff{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int sum = x+y;
int diff = x-y;
System.out.println(sum);
System.out.println(diff);
sc.close();
}
}

// O/p-->
// 30
// 40
// 70 
// -10