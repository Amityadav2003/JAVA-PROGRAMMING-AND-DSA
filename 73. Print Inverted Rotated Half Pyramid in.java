import java.util.*;
public class JavaBasics{
public static void inverted_Rotated_HalfPyramid(int n){
  //outer loop 
  for(int i=1;i<=n;i++){
   //Spaces
   for(int j=1;j<=n-1;j++){
    System.out.print(" ");
   }//stars
   for(int j=1;j<=i;j++){
    System.out.print("*");
   }
   System.out.println();

  }
} 
public static void main(String arg[]){
  inverted_Rotated_HalfPyramid(4);
}
  }




