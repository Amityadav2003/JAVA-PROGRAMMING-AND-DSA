import java.util.*;
public class JavaBasics{

public static void main(String arg[]){
int matrix[][]={{1,2,3,7},
                {4,5,6,7},
                {7,8,9,10}};
int count =0;
for(int i=0; i<matrix.length;i++){
  for(int j=0;j<matrix[0].length;j++){
    if(matrix[i][j]==7){
      count++;
    }
  }
}
System.out.println(count);
}
}




