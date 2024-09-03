import java.util.*;
public class JavaBasics{
public static void zero_one_triangle(int n){
  int counter=1;
  //outer loop 
  for(int i=1;i<=n;i++){
   // inner -- number
   for(int j=1;j<=i;j++){
    if((i+j)%2==0){
      System.out.print("1");
    }
    else{
      System.out.print("0");
    }
   }
   
   System.out.println();

  }
} 
public static void main(String arg[]){
  zero_one_triangle(5);
}
  }




