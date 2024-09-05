import java.util.*;
public class JavaBasics{
public static int getLargestnumber(int number[]){
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<number.length;i++){
    if(largest<number[i]){
      largest=number[i];
    }
  }
  return largest;
}
  
public static void main(String arg[]){
  int number[]={2,4,6,8,10,12,14,16};
  System.out.println("largest number:"+getLargestnumber(number));
  
}
  }




