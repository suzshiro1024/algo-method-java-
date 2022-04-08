import java.util.*;

public class Main{
  public static int INF = 1<<29;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[][] c = new int[N][M];
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        c[i][j] = Integer.parseInt(sc.next());
      }
    }
    sc.close();

    int dp[][] = new int[N+1][M+1];
    for(int i=0; i<=N; i++){
      for(int j=0; j<=M; j++){
        dp[i][j] = INF;
      }
    }

    dp[0][0] = 0;
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        if(i-1<=N)  dp[i+1][j+1] = Math.min(dp[i+1][j+1],dp[i][j+1]+c[i][j]);
        if(j+1<=M)  dp[i+1][j+1] = Math.min(dp[i+1][j+1],dp[i+1][j]+c[i][j]);
        if(i+1<=N&&j+1<=M)  dp[i+1][j+1] = Math.min(dp[i+1][j+1],dp[i][j]+c[i][j]);
      }
    }

    System.out.println(dp[N][M]);
  }
}