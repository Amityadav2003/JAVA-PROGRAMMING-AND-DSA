import java.util.*;
public class JavaBasics{
public static boolean iseven(int num){
   if(num%2==0){
    return true;
   }else{
    return false;
   }
}
  
  

public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  int num=sc.nextInt();
 
  if(iseven(num)){
    System.out.println("Number is Even");

  }
  else{
    System.out.println("Number is Odd");
  }
}
  }




