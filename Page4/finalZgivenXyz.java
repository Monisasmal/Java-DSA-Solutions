import java.util.Scanner;

public class finalZgivenXyz {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x >= 20 && z < 100){
      System.out.println(z += 200);
    }else if( x >= 10 || y < 50){
      System.out.println(z += 100);
    }else{
      System.out.println(z);
    }
    sc.close();
  }
}

// O/P-->
// 25
// 30
// 80
// 280


