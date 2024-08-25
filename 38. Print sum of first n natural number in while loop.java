import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
int i=1;
int sum=0;
while (i<=n) {
  sum+=i;
  i++;
  
}
 System.out.println("Sum is :" + sum );
    }
}
