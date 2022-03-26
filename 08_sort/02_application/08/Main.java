import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());

    long A[][] = new long[N][2];
    for(int i=0; i<N; i++){
      A[i][0] = Long.parseLong(sc.next());
      A[i][1] = Long.parseLong(sc.next());
    }

    sc.close();

    Arrays.sort(A, new Comparator<long[]> (){
      @Override public int compare(long[] a, long[] b){
        return (int)(a[0] - b[0]);
      }
    });

    long ans = 0;
    for(int i=0; i<N && K > 0; i++){
      long num = Math.min(A[i][1], K);
      K -= num;
      ans += num * A[i][0];
    }

    System.out.println(ans);
  }
}