import java.util.*;
public class JavaBasics{
public static int SumDigit(int number){
int sumofdigit=0;
while (number>0) {
  int lastdigit=number%10;
  sumofdigit+=lastdigit;
  number/=10;
} 
return sumofdigit;
}
  
  

public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  int number=sc.nextInt();
 System.out.println("Sum is:"+ SumDigit(number));
  
}
  }




