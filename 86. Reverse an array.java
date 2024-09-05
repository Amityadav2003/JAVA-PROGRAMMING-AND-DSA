import java.util.*;
public class JavaBasics{
public static void revere(int number[]){
int first=0;
int last=number.length-1;
while ((first<last)) {
  int temp=number[last];
  number[last]=number[first];
  number[first]=temp;
  first++;
  last--;
  
} 

}
public static void main(String arg[]){
  int number[]={2,4,6,8,10,12,14,16};
  revere(number);
  for(int i=0; i<=number.length;i++){
    System.out.print(number[i]+" ");
  }
  System.out.println();
}
  }




