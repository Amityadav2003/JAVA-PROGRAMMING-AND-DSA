import java.util.*;
public class JavaBasics{
public static void hollow_rectangle(int n){

  for(int i=1; i<=n;i++){
    //space
    for(int j=1; j<=n-i;j++){
      System.out.print(" ");
    }
    //hollow rectangle
   
      for(int j=1;j<=n;j++){
        //cell- (i,j)
        if(i==1 || i==n || j==1 || j==n){
          //boundary cell
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    
    }
  }
  
  


public static void main(String arg[]){
  hollow_rectangle(5);
}
  }




