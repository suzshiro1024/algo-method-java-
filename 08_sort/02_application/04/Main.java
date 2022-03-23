import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());

    sc.close();

    Arrays.sort(A);

    int min = Integer.MAX_VALUE;
    for(int i=0; i<=N-K; i++){
      min = Math.min(min, (A[i+K-1] - A[i]));
    }

    System.out.println(min);
  }
}