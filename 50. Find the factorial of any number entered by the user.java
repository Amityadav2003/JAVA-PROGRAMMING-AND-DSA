import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  int number;
  int fact=1;
  System.out.println("Enter the number:");
  number=sc.nextInt();
  for(int i=1;i<=number;i++){
    fact*=i;
  }
  System.out.println("fact number:"+fact);
  }

    }




