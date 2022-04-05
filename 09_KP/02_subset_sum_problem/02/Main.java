import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());
    sc.close();

    int[][] dp = new int[N][M+1];

    dp[0][0] = 1;
    if(A[0] <= M)  dp[0][A[0]] = 1;
    for(int i=1; i<N; i++){
      for(int j=0; j<=M; j++){
        if(j<A[i])  dp[i][j] = dp[i-1][j]%1000;
        else dp[i][j] = (dp[i-1][j] + dp[i-1][j-A[i]])%1000;
      }
    }

    System.out.println(dp[N-1][M]);
  }
}