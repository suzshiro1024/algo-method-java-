import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[][] score = new int[N][N];
    int[][] dp = new int[N][N];

    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        score[i][j] = sc.nextInt();
      }
    }

    sc.close();

    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        if(i==0 && j==0){
          dp[i][j] = score[i][j];
        }else if(i==0){
          dp[i][j] = dp[i][j-1] + score[i][j];
        }else if(j==0){
          dp[i][j] = dp[i-1][j] + score[i][j];
        }else{
          dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + score[i][j];
        }
      }
    }

    System.out.println(dp[N-1][N-1]);
  }
}