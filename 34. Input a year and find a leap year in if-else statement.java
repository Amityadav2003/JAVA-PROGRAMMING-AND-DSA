import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Input a years");
  int year=sc.nextInt();

  boolean x=(year%4)==0;
  boolean y=(year%100)!=0;
  boolean z=((year%100==0) && (year%400==0));

  if(x && (y||z)){
    System.out.print(year+"is a leap ");
  }
  else{
    System.out.print(year+"is not leap");
  }
    }
}
