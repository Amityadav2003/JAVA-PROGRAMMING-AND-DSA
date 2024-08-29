import java.util.*;
public class JavaBasics{

  public static void calculator(int a, int b){
    int sum=a+b;
    System.out.println("Sum is:"+sum);
    return;
   
  }
public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  calculator(a, b);

  }

    }




