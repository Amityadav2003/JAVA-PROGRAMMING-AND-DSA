import java.util.*;
public class JavaBasics{

  public static boolean isprime(int n){
    boolean isprime=true;
    for(int i=2;i<=n-1;i++){
      if(n%2==0){
        isprime=false;
      }
    }
    return isprime;
  }
  public static int Primeinrange(int n){
    for(int i=2;i<=n;i++){
      if(isprime(i)){
        System.out.print(i+" ");
       
      }
    }
    System.out.println();
    return n;
  }

public static void main(String arg[]){
  System.out.println(Primeinrange(20));

    }
  }




