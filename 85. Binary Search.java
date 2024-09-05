import java.util.*;
public class JavaBasics{
public static int BinarySearch(int number[],int key){
int start=0;
int end=number.length-1;
while (start<=end) {
  int mid=(start+end)/2;
  if(number[mid]==key){
     return mid;
  }
  if(number[mid]<key){
    start=mid+1;

  }
  else{
    end=mid-1;
  }
  
}
return -1;
  }

  
public static void main(String arg[]){
  int number[]={2,4,6,8,10,12,14,16};
  int key=10;
  System.out.println("index for key is:"+BinarySearch(number,key));
}
  }




