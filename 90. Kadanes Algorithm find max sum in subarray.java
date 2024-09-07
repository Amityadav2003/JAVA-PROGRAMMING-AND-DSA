import java.util.*;
public class JavaBasics{
public static void kadanes(int number[]){
  int cs=0;
  int ms=Integer.MIN_VALUE;
 for(int i=0;i<number.length;i++){
  cs= cs+number[i];
  if(cs<0){
    cs=0;
  }
  ms=Math.max(cs,ms);
}
 System.out.println("max sum is:"+ms );
} 


public static void main(String arg[]){
  int number[]={2,4,6,8,10};
  kadanes(number);
  }
}




