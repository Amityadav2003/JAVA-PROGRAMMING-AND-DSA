import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  int n =  sc.nextInt();
  if(n==2){
    System.out.print("n is prime");
  }
  boolean isprime=true;
  for(int i=2;i<=n-1;i++)
  {
    if(n%i==0){
      isprime=false;
    }

    }
    if(isprime==true){
      System.out.print("n is prime");
    }else{
      System.out.print("n is not prime");
    }
  }

    }




