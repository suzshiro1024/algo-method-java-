import java.util.*;

public class Main{
  public static int INF = 1<<29;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    int[] B = new int[N];
    for(int i=0; i<N; i++){
      A[i] = Integer.parseInt(sc.next());
      B[i] = Integer.parseInt(sc.next());
    }
    sc.close();

    int[][] dp = new int[N+1][M+1];
    for(int i=0; i<=N; i++){
      for(int j=0; j<=M; j++){
        dp[i][j] = INF;
      }
    }

    dp[0][0] = 0;
    for(int i=0; i<N; i++){
      for(int j=0; j<=M; j++){
        if(dp[i][j] != INF) dp[i+1][j] = 0;
        if(j >= A[i]){
          if(dp[i][j-A[i]] < INF){
            dp[i+1][j] = Math.min(dp[i+1][j], 1);
          }
          if(dp[i+1][j-A[i]] < B[i]){
            dp[i+1][j] = Math.min(dp[i+1][j-A[i]]+1, dp[i+1][j]);
          }
        }
      }
    }

    if(dp[N][M] < INF){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}