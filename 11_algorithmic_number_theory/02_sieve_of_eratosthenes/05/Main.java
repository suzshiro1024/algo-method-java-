import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    sc.close();

    boolean[] sieve = new boolean[N+1];
    Arrays.fill(sieve, true);
    sieve[0] = false;
    sieve[1] = false;
    for(int i=2; i<=N; i++){
      if(!sieve[i]) continue;
      for(int j=i*2; j<=N; j+=i){
        sieve[j] = false;
      }
    }

    int ans = 0;
    for(int i=0; i<=N/2; i++){
      if(sieve[i] && sieve[N-i])  ans++;
    }
    System.out.println(ans);
  }
}