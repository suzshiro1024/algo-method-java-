import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[][] field = new int[N][N];
    for(int i=0; i<N; i++)  field[0][i] = sc.nextInt();

    for(int i=1; i<N; i++){
      for(int j=0; j<N; j++){
        if(j-1<0){
          field[i][j] = (field[i-1][j] + field[i-1][j+1])%100;
        }else if(j+1>N-1){
          field[i][j] = (field[i-1][j-1] + field[i-1][j])%100;
        }else{
          field[i][j] = (field[i-1][j-1] + field[i-1][j] + field[i-1][j+1])%100;
        }
      }
    }

    System.out.println(field[N-1][N-1]);
  }
}