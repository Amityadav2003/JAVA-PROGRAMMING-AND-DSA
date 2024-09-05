import java.util.*;
public class JavaBasics{
public static void printpairs(int number[]){
 for(int i=0;i<number.length;i++){
  int curr=number[i];
  for(int j=i+1;j<number.length;j++){
    System.err.print("("+curr+","+number[j]+")");
  }
  System.out.println();
 }
} 


public static void main(String arg[]){
  int number[]={2,4,6,8,10,12,14,16};
  printpairs(number);
  }
}




