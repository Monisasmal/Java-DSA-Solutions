// Write a program to print Z,z,X,x,V,v,T,t,R,r,..............uptil A,a.

// Input Format

// No input


package Page10;
public class PrintZzXxVv {
  public static void main(String args[]){
    for(char i = 'Z'; i>='A'; i--){
      System.out.print(i + " "+ Character.toLowerCase(i)+" ");
    }
  }
}

// O/P-->
// Z z Y y X x W w V v U u T t S s R r Q q P p O o N n M m L l K k J j I i H h G g F f E e D d C c B b A a 
