import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int[][] field = new int[4][4];
    for(int i=0; i<4; i++)  field[0][i] = sc.nextInt();

    for(int i=1; i<4; i++){
      for(int j=0; j<4; j++){
        if(j-1<0){
          field[i][j] = field[i-1][j] + field[i-1][j+1];
        }else if(j+1>3){
          field[i][j] = field[i-1][j-1] + field[i-1][j];
        }else{
          field[i][j] = field[i-1][j-1] + field[i-1][j] + field[i-1][j+1];
        }
      }
    }

    System.out.println(field[3][3]);
  }
}