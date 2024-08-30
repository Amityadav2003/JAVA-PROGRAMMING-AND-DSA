import java.util.*;
public class JavaBasics{
public static int avg(int a,int b,int c){
return (a+b+c)/3;
}
  
  

public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the First number:");
  int a=sc.nextInt();
  System.out.print("Enter the second number:");
  int b=sc.nextInt();
  System.out.print("Enter the third number:");
  int c=sc.nextInt();

  System.out.println(avg(a, b, c));
}
  }




