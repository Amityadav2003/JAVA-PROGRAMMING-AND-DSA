import java.util.*;
public class JavaBasics{
public static void update(int number[]){
  for(int i=0;i<number.length;i++){
    number[i]=number[i]+1;
  }
}
  
public static void main(String arg[]){
  int number[]={97,98,99};
  update(number);
  for(int i=0;i<number.length;i++){
    System.out.print(number[i]+" ");

  }
}
  }




