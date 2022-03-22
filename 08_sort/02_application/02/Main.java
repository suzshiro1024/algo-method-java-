import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());

    int[] X = new int[M];
    for(int i=0; i<M; i++)  X[i] = Integer.parseInt(sc.next());

    sc.close();

    Arrays.sort(A);

    for(int i=0; i<M; i++)  System.out.println(A[X[i]]);
  }
}