import java.util.*;
public class JavaBasics{
public static void decTobin(int n){
  int mynum=n;
  int pow=0;
  int binnum=0;
  while (n>0) {
    int rem=n%2;
    binnum = binnum+(rem*(int) Math.pow(10,pow));
    pow++;
    n=n/2;
  }
  System.out.println("binary form  of"+mynum+"="+binnum);
}
  

public static void main(String arg[]){
  decTobin(12);
}
  }




