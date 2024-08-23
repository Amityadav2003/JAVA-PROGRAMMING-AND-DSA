import java.util.*;
public class JavaBasics{
public static void main(String arg[]){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter week number(1-7):");
  int week=sc.nextInt();

switch (week) {
    case 1 :System.out.println("Monday");
    break;
    case 2 :System.out.println("Tuesday");
    break;
    case 3 :System.out.println("wednesday");
    break;
    case 4 :System.out.println("thursday");
    break;
    case 5 :System.out.println("friday");
    break;
    case 6 :System.out.println("saturday");
    break;
    case 7 :System.out.println("sunday");
    break;

  default:System.out.println("Take a number is not valid");
    break;
}

    }
}
