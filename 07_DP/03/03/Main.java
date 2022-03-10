import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] move = new int[N-1];
    for(int i=0; i<N-1; i++)  move[i] = sc.nextInt();

    int[] point = new int[N-1];
    for(int i=0; i<N-1; i++)  point[i] = sc.nextInt();

    sc.close();

    int[][] dp = new int[N][M];
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        dp[i][j] = -1;
      }
    }
    dp[0][0] = 0;

    for(int i=0; i<N-1; i++){
      for(int j=0; j<M; j++){
        if(dp[i][j] == -1) continue;
        dp[i+1][j] = Math.max(dp[i][j],dp[i+1][j]);
        if(j+move[i]<M) dp[i+1][j+move[i]] = Math.max(dp[i][j+move[i]], dp[i][j]+point[i]);
      }
    }

    System.out.println(dp[N-1][M-1]);
  }
}