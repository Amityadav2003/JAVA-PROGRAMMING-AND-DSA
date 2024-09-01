import java.util.*;
public class JavaBasics{
public static void hollow_rectangle(int totRows, int totCols){
  //outer loop -- row
  for(int i=1;i<=totRows;i++){
    //inner loop -- col
    for(int j=1;j<=totCols;j++){
      //cell- (i,j)
      if(i==1 || i==totRows || j==1 || j==totCols){
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
  hollow_rectangle(4,5);
}
  }




