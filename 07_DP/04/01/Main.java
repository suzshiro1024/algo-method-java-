import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int[][] F = new int[3][N];
    int[][] dp = new int[3][N];

    for(int i=0; i<3; i++){
      for(int j=0; j<N; j++){
        F[i][j] = Integer.parseInt(sc.next());
      }
    }

    sc.close();

    for(int i=0; i<3; i++){
      for(int j=0; j<N; j++){
        dp[i][j] = Integer.MAX_VALUE;
      }
    }

    for(int i=0; i<3; i++)  dp[i][0] = 0;

    for(int i=0; i<N-1; i++){
      for(int j=0; j<3; j++){
        for(int k=0; k<3; k++){
          int cost = Math.abs(F[j][i] - F[k][i+1]);
          dp[k][i+1] = Math.min(dp[k][i+1], dp[j][i]+cost);
        }
      }
    }

    System.out.println(min(dp[0][N-1], dp[1][N-1], dp[2][N-1]));
  }

  public static int min(int a, int b, int c){
    return Math.min(a, Math.min(b, c));
  }
}