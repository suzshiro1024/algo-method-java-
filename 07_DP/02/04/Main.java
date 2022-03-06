import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[][] field = new int[N][N];

    for(int i=0; i<N; i++){
      field[0][i] = 1;
      field[i][0] = 1;
    }

    for(int i=1; i<N; i++){
      for(int j=1; j<N; j++){
        field[i][j] = field[i-1][j] + field[i][j-1];
      }
    }

    System.out.println(field[N-1][N-1]);
  }
}