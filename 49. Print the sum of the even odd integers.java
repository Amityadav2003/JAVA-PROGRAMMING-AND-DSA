import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  int number;
  int choose;
  int evensum=0;
  int oddsum=0;
  do{
    System.out.print("Enter the number:");
    number=sc.nextInt();
    if(number%2==0){
      evensum+=number;
    }
    else{
      oddsum+=number;
    }
    System.out.println("print continue press 1 and stop press 0");
    choose=sc.nextInt();
  }while(choose==1);
  System.out.println("Even number sum :"+evensum);
  System.out.println("Odd number sum :"+oddsum);
 
  }

    }




