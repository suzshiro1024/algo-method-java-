import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    String T = sc.next();
    sc.close();

    int S_length = S.length();
    int T_length = T.length();

    int[][] dp = new int[S_length+1][T_length+1];
    for(int i=0; i<S_length; i++){
      for(int j=0; j<T_length; j++){
        if(S.charAt(i)==T.charAt(j)) dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j]+1);
        dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i][j+1]);
        dp[i+1][j+1] = Math.max(dp[i+1][j+1],dp[i+1][j]);
      }
    }

    System.out.println(dp[S_length][T_length]);
  }
}