import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
do
{
  System.out.print("Enter the number:");
int n=sc.nextInt();
  if(n%10==0){
    break;
  }
  System.out.println(n);
}
while(true);
System.out.println("I am out of loop");
    }
}
