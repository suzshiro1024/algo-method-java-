import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    char[][] field = new char[N][N];
    int[][] pattern = new int[N][N];

    for(int i=0; i<N; i++){
      String str = sc.next();
      for(int j=0; j<N; j++){
        field[i][j] = str.charAt(j);
      }
    }

    pattern[0][0] = 1;
    for(int i=1; i<N; i++){
      if(field[i][0]=='#'){
        pattern[i][0] = 0;
        continue;
      }else{
        pattern[i][0] = pattern[i-1][0];
      }
    }

    for(int i=1; i<N; i++){
      if(field[0][i]=='#'){
        pattern[0][i] = 0;
        continue;
      }else{
        pattern[0][i] = pattern[0][i-1];
      }
    }

    for(int i=1; i<N; i++){
      for(int j=1; j<N; j++){
        if(field[i][j]=='#'){
          pattern[i][j] = 0;
          continue;
        }else{
          pattern[i][j] = pattern[i-1][j] + pattern[i][j-1];
        }
      }
    }

    System.out.println(pattern[N-1][N-1]);
  }
}