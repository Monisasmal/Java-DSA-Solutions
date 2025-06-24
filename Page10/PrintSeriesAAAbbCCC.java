package Page10;
public class PrintSeriesAAAbbCCC {
  public static void main(String args[]){
    char upperCase = 'A';
    char lowerCase = 'b';
    for(int i =0; i<26; i++){
      if(i%2 == 0){
        System.out.println((char)upperCase + "" + upperCase + "" + upperCase);
        upperCase += 2;
      }else{
        System.out.println((char)lowerCase + "" + lowerCase);
        lowerCase += 2;
      }
    }
  }
}


// o?p-->
// AAA
// bb 
// CCC
// dd 
// EEE
// ff 
// GGG
// hh
// III
// jj
// KKK
// ll
// MMM
// nn
// OOO
// pp
// QQQ
// rr
// SSS
// tt
// UUU
// vv
// WWW
// xx
// YYY
// zz
