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

    int sum = 0;
    for(int i=N-1; i>=N-K; i--) sum += A[i];

    System.out.println(sum);
  }
}