import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] W = new int[N];
    for(int i=0; i<N; i++)  W[i] = Integer.parseInt(sc.next());

    sc.close();

    int[][] dp = new int[N+1][M+1];
    for(int i=0; i<=N; i++){
      for(int j=0; j<=M; j++){
        dp[i][j] = Integer.MAX_VALUE;
      }
    }

    dp[0][0] = 0;

    for(int i=0; i<N; i++){
      for(int j=0; j<=M; j++){
        if(dp[i][j] == Integer.MAX_VALUE) continue;
        dp[i+1][j] = Math.min(dp[i+1][j], dp[i][j]);
        if(j+W[i] <= M) dp[i+1][j+W[i]] = Math.min(dp[i+1][j+W[i]], dp[i][j]+1);
      }
    }

    int ans = -1;
    if(dp[N-1][M] != Integer.MAX_VALUE){
      ans = dp[N-1][M];
    };
    System.out.println(ans);
  }
}