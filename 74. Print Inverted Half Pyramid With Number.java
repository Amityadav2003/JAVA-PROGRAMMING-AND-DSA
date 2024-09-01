import java.util.*;
public class JavaBasics{
public static void inverted_Half_Pyramid_WithNumber(int n){
  //outer loop 
  for(int i=1;i<=n;i++){
   // inner -- number
   for(int j=1;j<=n-i+1;j++){
    System.out.print(j+" ");
   }
   
   System.out.println();

  }
} 
public static void main(String arg[]){
  inverted_Half_Pyramid_WithNumber(5);
}
  }




