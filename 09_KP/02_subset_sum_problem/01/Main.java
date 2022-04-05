import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());

    sc.close();

    boolean[][] dp = new boolean[N][M+1];

    dp[0][0] = true;
    if(A[0] <= M) dp[0][A[0]] = true;
    for(int i=1; i<N; i++){
      for(int j=0; j<=M; j++){
        if(j<A[i])  dp[i][j] = dp[i-1][j];
        else dp[i][j] = dp[i-1][j] || dp[i-1][j-A[i]];
      }
    }

    if(dp[N-1][M]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}