import java.util.*;
public class JavaBasics{

  public static int factorial(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact = fact * i;
    }
       
    return fact;
   
  }
public static void main(String arg[]){
  int n=4;
 System.out.println("Factorial number is :"+factorial(n));
  }

    }




