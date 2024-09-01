import java.util.*;
public class JavaBasics{
public static void floyds_triangle(int n){
  int counter=1;
  //outer loop 
  for(int i=1;i<=n;i++){
   // inner -- number
   for(int j=1;j<=i;j++){
    System.out.print(counter+" ");
    counter++;
   }
   
   System.out.println();

  }
} 
public static void main(String arg[]){
  floyds_triangle(5);
}
  }




