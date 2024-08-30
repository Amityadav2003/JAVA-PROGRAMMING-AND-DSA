import java.util.*;
public class JavaBasics{
public static boolean ispalindrome(int number){
  int palindrome=number;
  int revers=0;
  while (palindrome!=0) {
   int remainder= palindrome%10;
   revers=revers*10+remainder;
   palindrome=palindrome/10;
    
  }

   if(number==revers){
    return true;
   }else{
    return false;
   }
}
  
  

public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  int number=sc.nextInt();
 
  if(ispalindrome(number)){
    System.out.println("Number is palindrome"+number);

  }
  else{
    System.out.println("Number is not palindrome"+number);
  }
}
  }




