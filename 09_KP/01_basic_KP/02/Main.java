import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());

    int[] w = new int[N];
    int[] v = new int[N];
    for(int i=0; i<N; i++){
      w[i] = Integer.parseInt(sc.next());
      v[i] = Integer.parseInt(sc.next());
    }

    sc.close();

    int[][] dp = new int[N][W+1];
    dp[0][0] = 0;
    dp[0][w[0]] = v[0];
    for(int i=1; i<N; i++){
      for(int j=0; j<=W; j++){
        if(j < w[i]) dp[i][j] = dp[i-1][j];
        else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
      }
    }

    int res = -1;
    for(int i=0; i<=W; i++){
      res = Math.max(dp[N-1][i], res);
    }

    System.out.println(res);
  }
}