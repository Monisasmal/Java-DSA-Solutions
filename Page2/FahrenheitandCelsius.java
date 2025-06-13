// You will be given Fahrenheit as input that should be stored in a double variable and print your answer in Celsius of data-type double.

// Input Format

// In each test case, you will get Fahrenheit as input.



import java.util.Scanner;

public class FahrenheitandCelsius {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  double Fahrenheit = sc.nextDouble();
  double Celsius = (Fahrenheit-32)*5/9;
  System.out.println(Celsius);
   sc.close();
  }
}

// O/P--->
// Fahrenheit = 45
// Celsius = 7.22222222
