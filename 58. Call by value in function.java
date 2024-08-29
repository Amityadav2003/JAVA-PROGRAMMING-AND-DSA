import java.util.*;
public class JavaBasics{

  public static void sawp(int a, int b){
    int temp=a;
        a=b;
        b=temp;
        
        System.out.println("a is:"+a);
        System.out.println("b is:"+b);
    return;
   
  }
public static void main(String arg[]){
  int a=10;
  int b=5;
  System.out.println("a is:"+a);
  System.out.println("b is:"+b);
  System.out.println("Swap value");

  sawp(a, b);
  
  }

    }




