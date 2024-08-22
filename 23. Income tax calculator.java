import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter the salary:");
  int income=sc.nextInt();
  int tax;
  if(income<500000){
    tax=0;
  }  
  else if(income>=500000 && income<1000000){
    tax=(int)(income * 0.2);
  }
  else{
    tax=(int)(income * 0.3);
  }
  System.out.println("Your tax is:"+ tax);
  
    }
}
