import java.util.*;
public class JavaBasics{
public static void Solid_Rhomnus(int n){

  for(int i=1; i<=n;i++){
    //space
    for(int j=1; j<=n-i;j++){
      System.out.print(" ");
    }
    //star
    for(int j=1; j<=n;j++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  

} 
public static void main(String arg[]){
  Solid_Rhomnus(5);
}
  }




