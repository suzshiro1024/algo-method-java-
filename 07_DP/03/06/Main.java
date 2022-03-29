import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());

    int[] X = new int[N];
    for(int i=0; i<N; i++) X[i] = Integer.parseInt(sc.next());
    sc.close();

    boolean[][] dp = new boolean[N+1][A];
    dp[0][0] = true;

    for(int i=0; i<N; i++){
      for(int j=0; j<A; j++){
        if(!dp[i][j]) continue;
        dp[i+1][j] = dp[i][j] || dp[i+1][j];
        int k = (j+X[i])%A;
        dp[i+1][k] = dp[i+1][k] || dp[i][j];
      }
    }

    if(dp[N][B]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}