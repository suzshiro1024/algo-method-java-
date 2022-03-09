import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] weight = new int[N+1];
    for(int i=0; i<N; i++){
      weight[i] = sc.nextInt();
    }
    boolean[][] dp = new boolean[N+1][M+1];

    dp[0][0] = true;

    for(int i=0; i<N; i++){
      for(int j=0; j<M+1; j++){
        if(!dp[i][j]) continue;
        dp[i+1][j] = true;
        if(j+weight[i] <= M) dp[i+1][j+weight[i]] = true;
      }
    }

    if(dp[N][M]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}