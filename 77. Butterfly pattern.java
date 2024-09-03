import java.util.*;
public class JavaBasics{
public static void Butterfly(int n){
  //1st half
  for(int i=1; i<=n;i++){
    //star
    for(int j=1; j<=i;j++){
      System.out.print("*");
    }
    //spaces  2*(n-i)
    for(int j=1; j<=2*(n-i);j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  //2nd half
  for(int i=n; i>=1;i--){
    //star
    for(int j=1; j<=i;j++){
      System.out.print("*");
    }
    //spaces  2*(n-i)
    for(int j=1; j<=2*(n-i);j++){
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
      System.out.print("*");
    }
    System.out.println();
  }

} 
public static void main(String arg[]){
  Butterfly(5);
}
  }




