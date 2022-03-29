import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int[] W = new int[N];
    for(int i=0; i<N; i++)  W[i] = Integer.parseInt(sc.next());
    sc.close();

    int M = 0;
    for(int i=0; i<N; i++)  M += W[i];

    boolean[][] dp = new boolean[N+1][M+1];

    dp[0][0] = true;
    for(int i=0; i<N; i++){
      for(int j=0; j<=M; j++){
        if(!dp[i][j]) continue;
        dp[i+1][j+W[i]] = true;
        dp[i+1][Math.abs(j-W[i])] = true;
      }
    }

    int res = 0;
    while(!dp[N][res]){
      res++;
    }
    System.out.println(res);
  }
}