import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());

    int[] A = new int[N];
    for(int i=0; i<N; i++)  A[i] = Integer.parseInt(sc.next());

    heap(A);

    for(int i=N-1; i>0; i--){
      int tmp = A[0];
      A[0] = A[i];
      A[i] = tmp;
      heap(A, i);
      if(i==M) print(A);
    }

    print(A);
  }

  public static void heap(int[] A){
    int N = A.length;
    int x = N/2-1;

    while(x>=0){
      int k = x;
      while(2*k+1 < N){
        int l = 2*k+1;
        int r = 2*k+2;

        int max = Math.max(A[k], A[l]);
        if(r < N) max = Math.max(max, A[r]);

        if(max == A[k]){
          break;
        }else if(max == A[l]){
          int tmp = A[k];
          A[k] = A[l];
          A[l] = tmp;
          k = l;
        }else{
          int tmp = A[k];
          A[k] = A[r];
          A[r] = tmp;
          k = r;
        }
      }
      x--;
    }
  }

  public static void heap(int[] A, int i){
    int x = 0;

    while(x>=0){
      int k = x;
      while(2*k+1 < i){
        int l = 2*k+1;
        int r = 2*k+2;

        int max = Math.max(A[k], A[l]);
        if(r < i) max = Math.max(max, A[r]);

        if(max == A[k]){
          break;
        }else if(max == A[l]){
          int tmp = A[k];
          A[k] = A[l];
          A[l] = tmp;
          k = l;
        }else{
          int tmp = A[k];
          A[k] = A[r];
          A[r] = tmp;
          k = r;
        }
      }
      x--;
    }
  }

  public static void print(int[] A){
    StringBuilder sb = new StringBuilder();

    for(int i=0; i<A.length; i++)  sb.append(A[i]+" ");

    System.out.println(sb);
  }
}