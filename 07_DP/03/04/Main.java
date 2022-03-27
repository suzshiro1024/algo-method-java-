import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[][] dp = new int[N][M+1];
    for(int i=0; i<N; i++){
      for(int j=0; j<=M; j++){
        dp[i][j] = Integer.MIN_VALUE;
      }
    }
    int[] W = new int[N];
    int[] V = new int[N];

    for(int i=0; i<N; i++) W[i] = Integer.parseInt(sc.next());
    for(int i=0; i<N; i++) V[i] = Integer.parseInt(sc.next());

    sc.close();

    dp[0][0] = 0;
    if(W[0] < M) dp[0][W[0]] = V[0];
    for(int i=1; i<N; i++){
      for(int j=0; j<=M; j++){
        if(j < W[i])  dp[i][j] = dp[i-1][j];
        else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-W[i]] + V[i]);
      }
    }

    int result = dp[N-1][0];
    for(int i=1; i<=M; i++){
      if(dp[N-1][i] > result) result = dp[N-1][i];
    }
    System.out.println(result);
  }
}